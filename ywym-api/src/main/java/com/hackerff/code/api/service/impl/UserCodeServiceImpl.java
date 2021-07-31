package com.hackerff.code.api.service.impl;

import com.hackerff.code.api.service.UserCodeService;
import com.hackerff.code.mapper.YwymUserCodeMapper;
import com.hackerff.code.model.YwymUserCode;
import com.hackerff.code.model.YwymUserCodeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
}
