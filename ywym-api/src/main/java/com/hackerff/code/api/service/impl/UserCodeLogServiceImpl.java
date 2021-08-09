package com.hackerff.code.api.service.impl;

import com.github.pagehelper.PageHelper;
import com.hackerff.code.api.service.UserCodeLogService;
import com.hackerff.code.mapper.YwymUserCodeLogMapper;
import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserCodeLog;
import com.hackerff.code.model.YwymUserCodeLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.util.Date;
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
    public List<YwymUserCodeLog> getLogsByUserId(int userId,int page,int pageSize) {
        YwymUserCodeLogExample example = new YwymUserCodeLogExample();
        example.createCriteria().andUserIdEqualTo(userId).andDeleteTimeIsNull();
        example.setOrderByClause("update_time desc");
        PageHelper.startPage(page,pageSize);
        List<YwymUserCodeLog> logs = userCodeLogMapper.selectByExample(example);
        return logs;
    }
}
