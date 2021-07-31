package com.hackerff.code.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hackerff.code.api.service.UserCodeLogService;
import com.hackerff.code.mapper.YwymUserCodeLogMapper;
import com.hackerff.code.mapper.YwymUserCodeMapper;
import com.hackerff.code.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/28 15:13
 */
@Service
public class UserCodeLogServiceImpl implements UserCodeLogService {
    @Autowired
    private YwymUserCodeLogMapper userCodeLogMapper;

    @Override
    public YwymUserCodeLog getLogByUserIdAndCodeId(int userId, int codeId) {
        YwymUserCodeLogExample example = new YwymUserCodeLogExample();
        example.createCriteria().andUserIdEqualTo(userId).andCodeIdEqualTo(codeId);
        List<YwymUserCodeLog> logList = userCodeLogMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(logList)){
            return logList.get(0);
        }
        return null;
    }

    @Override
    public YwymUserCodeLog insertLog(YwymUser user,YwymCode code) {
        YwymUserCodeLog userCodeLog = new YwymUserCodeLog();
        userCodeLog.setCodeId(code.getId());
        userCodeLog.setUserId(user.getId());
        userCodeLogMapper.insertSelective(userCodeLog);
        return userCodeLog;
    }

    @Override
    public List<YwymUserCodeLog> getLogsByUserId(int userId,int pageNum,int pageSize) {
        YwymUserCodeLogExample example = new YwymUserCodeLogExample();
        example.createCriteria().andUserIdEqualTo(userId);
        PageHelper.startPage(pageNum,pageSize);
        List<YwymUserCodeLog> logs = userCodeLogMapper.selectByExample(example);
        return logs;
    }
}
