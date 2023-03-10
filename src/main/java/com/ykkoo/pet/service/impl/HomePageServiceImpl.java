
package com.ykkoo.pet.service.impl;


import com.google.common.collect.Lists;
import com.ykkoo.pet.common.http.KVResult;
import com.ykkoo.pet.common.type.FileType;
import com.ykkoo.pet.common.type.VariableType;
import com.ykkoo.pet.pojo.PetFile;
import com.ykkoo.pet.pojo.PetVariable;
import com.ykkoo.pet.service.FileService;
import com.ykkoo.pet.service.HomePageService;
import com.ykkoo.pet.service.InsuranceService;
import com.ykkoo.pet.service.VariableService;
import com.ykkoo.pet.vo.HomePageVO;
import com.ykkoo.pet.vo.InsuranceBriefVO;
import com.ykkoo.pet.vo.InsuranceVO;
import com.ykkoo.pet.vo.RotationChartVO;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@AllArgsConstructor
public class HomePageServiceImpl implements HomePageService {



    private FileService fileService;

    private VariableService variableService;

    private InsuranceService insuranceService;


    public KVResult<HomePageVO> getV1() {
        /* 43 */
        List<PetFile> rotationChartFileList = this.fileService.findAllByTypeAndState(FileType.ROTATION_CHART, 1);

        /* 45 */
        Collections.sort(rotationChartFileList);

        /* 47 */
        List<RotationChartVO> rotationChartVOList = Lists.newArrayList();

        /* 49 */
        for (PetFile petFile : rotationChartFileList) {
            /* 50 */
            RotationChartVO rotationChartVO = new RotationChartVO();
            /* 51 */
            rotationChartVO.setFileId(petFile.getFileId());
            /* 52 */
            rotationChartVO.setPicUrl(petFile.getFileUrl());
            /* 53 */
            rotationChartVO.setJumpLink(petFile.getJumpLink());
            /* 54 */
            rotationChartVOList.add(rotationChartVO);

        }


        /* 58 */
        List<PetFile> insuranceBriefFileList = this.fileService.findAllByTypeAndState(FileType.INSURANCE_BRIEF, 1);

        /* 60 */
        Collections.sort((List) insuranceBriefFileList);

        /* 62 */
        List<InsuranceBriefVO> insuranceBriefVOList = Lists.newArrayList();

        /* 64 */
        for (PetFile petFile : insuranceBriefFileList) {
            /* 65 */
            InsuranceBriefVO insuranceBriefVO = new InsuranceBriefVO();
            /* 66 */
            insuranceBriefVO.setJumpLink(petFile.getJumpLink());
            /* 67 */
            insuranceBriefVO.setFileId(petFile.getFileId());
            /* 68 */
            insuranceBriefVO.setPicUrl(petFile.getFileUrl());
            /* 69 */
            insuranceBriefVO.setInsuranceId(petFile.getInsuranceId());
            /* 70 */
            insuranceBriefVOList.add(insuranceBriefVO);

        }


        /* 74 */
        PetVariable membersVar = this.variableService.findByType(VariableType.MEMBERS);
        /* 75 */
        Integer members = Integer.valueOf(3000);
        /* 76 */
        if ((membersVar != null) &&
                /* 77 */       (membersVar.getIntVar() != null)) {
            /* 78 */
            members = membersVar.getIntVar();

        }



        /* 83 */
        PetVariable costVar = this.variableService.findByType(VariableType.COST);
        /* 84 */
        Integer cost = Integer.valueOf(100000);
        /* 85 */
        if ((costVar != null) &&
                /* 86 */       (costVar.getIntVar() != null)) {
            /* 87 */
            cost = costVar.getIntVar();

        }



        /* 92 */
        HomePageVO homePageVO = new HomePageVO();
        /* 93 */
        homePageVO.setRotationChartVOList(rotationChartVOList);
        /* 94 */
        homePageVO.setInsuranceBriefVOList(insuranceBriefVOList);
        /* 95 */
        homePageVO.setMembers(members);
        /* 96 */
        homePageVO.setCost(cost);
        /* 97 */
        homePageVO.setShow(Integer.valueOf(1));

        /* 99 */
        return KVResult.put(homePageVO);

    }

    @Override
    public KVResult<HomePageVO> getV2() {
        /* 43 */
        List<PetFile> rotationChartFileList = this.fileService.findAllByTypeAndState(FileType.ROTATION_CHART, 1);

        /* 45 */
        Collections.sort(rotationChartFileList);

        /* 47 */
        List<RotationChartVO> rotationChartVOList = Lists.newArrayList();

        /* 49 */
        for (PetFile petFile : rotationChartFileList) {
            /* 50 */
            RotationChartVO rotationChartVO = new RotationChartVO();
            /* 51 */
            rotationChartVO.setFileId(petFile.getFileId());
            /* 52 */
            rotationChartVO.setPicUrl(petFile.getFileUrl());
            /* 53 */
            rotationChartVO.setJumpLink(petFile.getJumpLink());
            /* 54 */
            rotationChartVOList.add(rotationChartVO);
        }


        /* 74 */
        PetVariable membersVar = this.variableService.findByType(VariableType.MEMBERS);
        /* 75 */
        Integer members = Integer.valueOf(3000);
        /* 76 */
        if ((membersVar != null) && (membersVar.getIntVar() != null)) {
            members = membersVar.getIntVar();
        }


        /* 83 */
        PetVariable costVar = this.variableService.findByType(VariableType.COST);
        /* 84 */
        Integer cost = Integer.valueOf(100000);
        /* 85 */
        if ((costVar != null) &&
                /* 86 */       (costVar.getIntVar() != null)) {
            /* 87 */
            cost = costVar.getIntVar();

        }

        KVResult<List<InsuranceVO>> insuranceVOList = insuranceService.findInsuranceByState(1);


        /* 92 */
        HomePageVO homePageVO = new HomePageVO();
        /* 93 */
        homePageVO.setRotationChartVOList(rotationChartVOList);
        /* 94 */
        homePageVO.setInsuranceVOList(insuranceVOList.getVal());
        /* 95 */
        homePageVO.setMembers(members);
        /* 96 */
        homePageVO.setCost(cost);
        /* 97 */
        homePageVO.setShow(Integer.valueOf(1));

        homePageVO.setFloatingWindowPictures("????????????");
        homePageVO.setFloatingWindowLink("??????????????????");
        homePageVO.setPublicNumberPictures("?????????????????????");

        /* 99 */
        return KVResult.put(homePageVO);
    }

}