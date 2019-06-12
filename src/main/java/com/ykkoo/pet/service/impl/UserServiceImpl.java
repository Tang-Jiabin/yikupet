package com.ykkoo.pet.service.impl;

import com.google.common.collect.Maps;
import com.ykkoo.pet.bo.CodeSessionBO;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.token.TokenManage;
import com.ykkoo.pet.common.token.TokenModel;
import com.ykkoo.pet.dto.UserInfoDTO;
import com.ykkoo.pet.pojo.PetAnimal;
import com.ykkoo.pet.pojo.PetPromoter;
import com.ykkoo.pet.pojo.PetUserInfo;
import com.ykkoo.pet.pojo.PetWechatUserInfo;
import com.ykkoo.pet.repository.PetAnimalRepository;
import com.ykkoo.pet.repository.PetUserInfoRepository;
import com.ykkoo.pet.repository.PetWechatUserInfoRepository;
import com.ykkoo.pet.service.UserService;
import com.ykkoo.pet.utils.OkHttpUtil;
import com.ykkoo.pet.utils.wechat.WeChatConfig;
import com.ykkoo.pet.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户
 *
 * @author : J.Tang
 * @version : v1.0
 * @date : 2019/5/13
 * @email : seven_tjb@163.com
 **/
@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private PetWechatUserInfoRepository wechatUserInfoRepository;
    private PetUserInfoRepository userInfoRepository;
    private TokenManage tokenManage;
    private PetAnimalRepository animalRepository;

    @Override
    public KVResult smallLogin(String code) {

        if (StringUtils.isEmpty(code)) {
            return KVResult.put(411, "code不能为空");
        }

        Map<String, String> param = Maps.newHashMap();
        param.put("appid", WeChatConfig.APP_ID);
        param.put("secret", WeChatConfig.APP_SECRET);
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");

        Response response = OkHttpUtil.INSTANCE.doGet(WeChatConfig.CODE_SESSION_URL, param);

        CodeSessionBO codeSession = OkHttpUtil.jsonResponseToClass(response, CodeSessionBO.class);

        if (codeSession == null) {
            return KVResult.put(412, "code错误");
        }

        if (null != codeSession.getErrcode() && 0 != codeSession.getErrcode()) {
            return KVResult.put(codeSession.getErrcode(), codeSession.getErrmsg());
        }

        PetWechatUserInfo wechatUserInfo = wechatUserInfoRepository.findByOpenid(codeSession.getOpenid());
        PetUserInfo userInfo;
        if (wechatUserInfo == null) {

            userInfo = new PetUserInfo();
            userInfo.setHeadPortrait("http://img-cdn.xykoo.cn/touxiang.png");
            userInfo.setNickName("微宠用户");
            userInfo.setToken(" ");
            userInfo.setPhone(" ");
            userInfo.setGender(0);
            userInfo.setCreateDate(new Date());
            userInfo.setUpdateDate(new Date());
            userInfo.setLoginDate(new Date());
            userInfo = userInfoRepository.save(userInfo);

            wechatUserInfo = new PetWechatUserInfo();
            wechatUserInfo.setOpenid(codeSession.getOpenid());
            wechatUserInfo.setSessionKey(codeSession.getSession_key());
            wechatUserInfo.setUnionid(codeSession.getUnionid());
            wechatUserInfo.setCreateDate(new Date());
            wechatUserInfo.setUpdateDate(new Date());
            wechatUserInfo.setUserInfoId(userInfo.getUserId());
            wechatUserInfo = wechatUserInfoRepository.save(wechatUserInfo);
        } else {
            wechatUserInfo.setUpdateDate(new Date());
            wechatUserInfo.setOpenid(codeSession.getOpenid());
            wechatUserInfo.setSessionKey(codeSession.getSession_key());
            wechatUserInfo.setUnionid(codeSession.getUnionid());
            wechatUserInfo = wechatUserInfoRepository.save(wechatUserInfo);
            userInfo = userInfoRepository.findByUserId(wechatUserInfo.getUserInfoId());
            userInfo.setLoginDate(new Date());
            userInfo = userInfoRepository.save(userInfo);
        }

        TokenModel userToken = tokenManage.createUserToken(userInfo.getUserId());

        UserVO userVO = new UserVO();
        userVO.setNickName(userInfo.getNickName());
        userVO.setHeadPortrait(userInfo.getHeadPortrait());
        userVO.setToken(userToken.getToken());
        userVO.setLoginDate(wechatUserInfo.getUpdateDate());
        userVO.setUpdateDate(userInfo.getUpdateDate());


        return KVResult.put(userVO);
    }

    @Override
    public KVResult setUserInfo(UserInfoDTO userInfoDTO, Integer userId) {

        PetUserInfo userInfo = userInfoRepository.findByUserId(userId);

        if (userInfo == null) {
            return KVResult.put(411, "用户不存在");
        }

        userInfo.setHeadPortrait(userInfoDTO.getHeadPortrait());
        userInfo.setNickName(userInfoDTO.getNickName());
        userInfo.setGender(userInfoDTO.getGender());
        userInfo.setUpdateDate(new Date());
        userInfo = userInfoRepository.save(userInfo);

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userInfo, userVO);

        return KVResult.put(userVO);
    }

    @Override
    public KVResult<UserVO> getUserInfo(Integer userId) {

        PetUserInfo userInfo = findByUserId(userId);
        if (userInfo == null) {
            return KVResult.put(411,new UserVO());
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userInfo,userVO);

        return KVResult.put(userVO);
    }

    @Override
    public PetUserInfo findByPhone(String paramString) {
        return userInfoRepository.findByPhone(paramString);
    }

    @Override
    public KVResult getUserPage(Integer page, Integer size, String phone,String nickName, String realName, String cardNumber, Integer adminId) {

        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "userId");
        Page<PetUserInfo> userInfoPage = userInfoRepository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();

            if (!StringUtils.isEmpty(phone)) {
                list.add(criteriaBuilder.equal(root.get("phone").as(String.class), phone));
            }

            if (!StringUtils.isEmpty(nickName)) {
                list.add(criteriaBuilder.equal(root.get("nickName").as(String.class), nickName));
            }

            if (!StringUtils.isEmpty(realName)) {
                list.add(criteriaBuilder.equal(root.get("realName").as(String.class), realName));
            }

            if(!StringUtils.isEmpty(cardNumber)){
                PetAnimal animal = animalRepository.findByElectronicCard(cardNumber);
                if (animal != null) {
                    list.add(criteriaBuilder.equal(root.get("userId").as(Integer.class), animal.getUserId()));
                }else {
                    list.add(criteriaBuilder.equal(root.get("userId").as(Integer.class), 0));
                }
            }

            Predicate[] p = new Predicate[list.size()];
            return criteriaBuilder.and(list.toArray(p));
        }, pageable);


        return KVResult.put(userInfoPage);
    }

    @Override
    public List<PetUserInfo> findAllByUserIdIn(List<Integer> paramList) {
        return userInfoRepository.findAllByUserIdIn(paramList);
    }

    @Override
    public PetUserInfo findByUserId(Integer userId) {
        return userInfoRepository.findByUserId(userId);
    }

    @Override
    public PetUserInfo save(PetUserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }


}
