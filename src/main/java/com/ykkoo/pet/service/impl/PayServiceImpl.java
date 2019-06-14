package com.ykkoo.pet.service.impl;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.ykkoo.pet.pojo.*;
import com.ykkoo.pet.repository.*;
import com.ykkoo.pet.service.PayService;
import com.ykkoo.pet.utils.DoubleUtil;
import com.ykkoo.pet.utils.SnowflakeIdFactory;
import com.ykkoo.pet.utils.wechat.pay.utls.PayCommonUtil;
import com.ykkoo.pet.utils.wechat.pay.utls.XmlUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.*;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PayServiceImpl implements PayService {


    private static final Logger log = LoggerFactory.getLogger(PayServiceImpl.class);

    private PetInsurancePolicyRepository insurancePolicyRepository;

    private PetAnimalRepository animalRepository;
    private PetHospitalInfoRepository hospitalInfoRepository;
    private PetHospitalAccountRepository hospitalAccountRepository;
    private PetDiseaseRepository diseaseRepository;
    private PetInsuranceDiseaseRepository insuranceDiseaseRepository;
    private PetPromoterRepository promoterRepository;

    public String tenPayCallback(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InputStream inStream = request.getInputStream();
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte['Ѐ'];
        int len;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        outStream.close();
        inStream.close();

        String result = new String(outStream.toByteArray(), "utf-8");
        Map<String, String> params = XmlUtil.readStringXmlOut(result);
        if ("SUCCESS".equalsIgnoreCase((String) params.get("result_code"))) {
            log.error("                 微信回调信息");


            for (Object aSet : params.keySet()) {
                String key = (String) aSet;
                String value = (String) params.get(key);
                log.error("    " + key + "    " + value + "    ");
            }


            String payNumber = (String) params.get("transaction_id");
            String orderNumber = (String) params.get("out_trade_no");
            String realAmount = String.valueOf(Double.valueOf((String) params.get("total_fee")).doubleValue() / 100.0D);
            Double doubleFee = Double.valueOf(Double.valueOf((String) params.get("total_fee")).doubleValue() / 100.0D);
            String refundFee = String.valueOf(doubleFee);
            String jsonMap = (String) params.get("attach");
            log.error("金额{}", refundFee);


            String str = null;
            Map map = null;
            try {
                str = URLDecoder.decode(jsonMap, "utf-8");
                try {
                    map = (Map) JSON.parse(str);
                } catch (Exception e) {
                    str = URLDecoder.decode(str, "utf-8");
                    map = (Map) JSON.parse(str);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }


            Integer insurancePolicyId = (Integer) map.get("ip");
            Integer animalId = (Integer) map.get("an");
            Integer promoterId = (Integer) map.get("pi");


            map.put("payNumber", payNumber);
            map.put("orderNumber", orderNumber);
            map.put("realAmount", realAmount);
            map.put("insurancePolicyId", insurancePolicyId);
            map.put("animalId", animalId);
            map.put("promoterId", promoterId);
            map.put("doubleFee", doubleFee);

            try {
                callbackUpdate(map);
            } catch (Exception e) {
                log.error("回调失败" + insurancePolicyId);
            }


            response.setContentType("text/xml");
            ServletOutputStream out = response.getOutputStream();
            out.write(PayCommonUtil.setXML("SUCCESS", "OK").getBytes("UTF-8"));
            out.close();
        }


        return "success";
    }


    private void callbackUpdate(Map map) {

        PetInsurancePolicy insurancePolicy = insurancePolicyRepository.findByInsurancePolicyId((Integer) map.get("insurancePolicyId"));
        insurancePolicy.setInsuranceStatus(2);
        insurancePolicyRepository.save(insurancePolicy);
        PetAnimal animal = this.animalRepository.findByAnimalId((Integer) map.get("animalId"));
        animal.setInsuranceStatus(2);
        animalRepository.save(animal);

        List<PetDisease> diseaseList = diseaseRepository.findAllByDiseaseStateAndInsuranceId(1, insurancePolicy.getInsuranceId());
        SnowflakeIdFactory sf = new SnowflakeIdFactory(SnowflakeIdFactory.getWorkerId(), 15);
        PetInsuranceDisease insuranceDisease;
        List<PetInsuranceDisease> insuranceDiseaseList = new ArrayList<>();
        for (PetDisease petDisease : diseaseList) {
            insuranceDisease = new PetInsuranceDisease();
            BeanUtils.copyProperties(petDisease, insuranceDisease);
            insuranceDisease.setInsurancePolicyId(insurancePolicy.getInsurancePolicyId());
            insuranceDisease.setInsuranceDiseaseId(sf.nextId());
            insuranceDiseaseList.add(insuranceDisease);
        }

        insuranceDiseaseRepository.saveAll(insuranceDiseaseList);

        Integer promoterId = (Integer) map.get("promoterId");

        if (promoterId != null && promoterId != 0) {
            Double doubleFee = (Double) map.get("doubleFee");
            PetPromoter promoter = promoterRepository.findByPromoterId(promoterId);

            Double returnRatio = 10D;
            if (promoter.getReturnRatio() != null) {
                returnRatio = Double.valueOf(promoter.getReturnRatio());
            }
            Double money = DoubleUtil.mul(DoubleUtil.div(doubleFee, 100D),returnRatio);
            PetHospitalAccount hospitalAccount = new PetHospitalAccount();
            hospitalAccount.setHospitalId(0);
            hospitalAccount.setPromoterId(promoterId);
            hospitalAccount.setMoney(money);
            hospitalAccount.setType(2);
            hospitalAccount.setDate(new Date());
            hospitalAccount.setSource("邀请码返利");
            hospitalAccount.setRatio(promoter.getReturnRatio());
            hospitalAccount.setState(1);
            hospitalAccount.setWithdrawalId(0);
            hospitalAccount.setAccountType(2);
            hospitalAccountRepository.save(hospitalAccount);

        }
    }
}
