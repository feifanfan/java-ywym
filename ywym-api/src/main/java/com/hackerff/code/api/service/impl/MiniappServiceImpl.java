package com.hackerff.code.api.service.impl;

import com.hackerff.code.api.service.MiniappService;
import com.hackerff.code.mapper.YwymMiniappMapper;
import com.hackerff.code.model.YwymMiniapp;
import com.hackerff.code.model.YwymMiniappExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/26 16:33
 */
@Service
public class MiniappServiceImpl implements MiniappService {
    @Autowired
    private YwymMiniappMapper miniappMapper;


    @Override
    public YwymMiniapp getMiniAppByAppid(String appid) {
        YwymMiniappExample example = new YwymMiniappExample();
        example.createCriteria().andAppidEqualTo(appid);
        List<YwymMiniapp> list = miniappMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)){
            return list.get(0);
        }
        return null;
    }
}
