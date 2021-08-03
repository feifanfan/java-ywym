package com.hackerff.code.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hackerff.code.api.service.UserCodeService;
import com.hackerff.code.mapper.YwymCodeMapper;
import com.hackerff.code.mapper.YwymUserCodeLogMapper;
import com.hackerff.code.mapper.YwymUserCodeMapper;
import com.hackerff.code.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/28 11:39
 */
@Service
public class UserCodeServiceImpl implements UserCodeService {

    @Autowired
    private YwymUserCodeMapper userCodeMapper;
    @Autowired
    private YwymUserCodeLogMapper userCodeLogMapper;
    @Autowired
    private YwymCodeMapper codeMapper;
    @Override
    public YwymUserCode getUserCodeById(int id) {
        YwymUserCode userCode = userCodeMapper.selectByPrimaryKey(id);
        return userCode;
    }

    @Override
    public YwymUserCode getUserCodeByCodeId(int codeId) {
        YwymUserCodeExample example = new YwymUserCodeExample();
        example.createCriteria().andCodeIdEqualTo(codeId);
        List<YwymUserCode> userCodes = userCodeMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userCodes)){
            return userCodes.get(0);
        }
        return null;
    }
    @Override
    public void CollectCode(int userId, int codeId) {
        YwymUserCodeLog userCodeLog = new YwymUserCodeLog();
        YwymUserCodeLogExample example = new YwymUserCodeLogExample();
        example.createCriteria().andCodeIdEqualTo(codeId).andUserIdEqualTo(userId);
        List<YwymUserCodeLog> userCodeList = userCodeLogMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userCodeList)){
            userCodeLog = userCodeList.get(0);
            userCodeLog.setCollect(!userCodeLog.getCollect());
            userCodeLogMapper.updateByPrimaryKey(userCodeLog);
        }else {
            //查询二维码是否存在
            YwymCode code = codeMapper.selectByPrimaryKey(codeId);
            if (code==null){
                return;
            }
            userCodeLog.setUserId(userId);
            userCodeLog.setCollect(true);
            userCodeLog.setCodeId(codeId);
            userCodeLogMapper.insertSelective(userCodeLog);
        }
        return;
    }

    @Override
    public List<YwymUserCode> getUserCodesByUserId(int userId,int page,int pageSize) {
        YwymUserCodeExample example = new YwymUserCodeExample();
        example.createCriteria().andUserIdEqualTo(userId);
        PageHelper.startPage(page,pageSize);
        List<YwymUserCode> userCodes = userCodeMapper.selectByExample(example);
        return userCodes;
    }

}
