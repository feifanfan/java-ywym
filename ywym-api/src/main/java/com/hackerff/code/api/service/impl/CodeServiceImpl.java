package com.hackerff.code.api.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.hackerff.code.api.service.CodeService;
import com.hackerff.code.mapper.YwymCodeMapper;
import com.hackerff.code.mapper.YwymUserCodeMapper;
import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymCodeExample;
import com.hackerff.code.model.YwymUserCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/27 10:54
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private YwymCodeMapper codeMapper;
    @Autowired
    private YwymUserCodeMapper userCodeMapper;

    @Override
    public YwymCode createCode(YwymUserCode userCode) {
        YwymCode code = new YwymCode();
        code.setUuid(IdUtil.simpleUUID());
        code.setUserId(userCode.getUserId());
        codeMapper.insertSelective(code);
        userCode.setCodeId(code.getId());
        if(!userCode.getPassword().equals("")){
            userCode.setPassword(SecureUtil.md5(userCode.getPassword()));
        }
        userCodeMapper.insertSelective(userCode);
        return code;
    }

    @Override
    public YwymCode getCodeById(int id) {
        YwymCode code = codeMapper.selectByPrimaryKey(id);
        if(code.getCompanyId().equals(0)){

        }
        return code;
    }

    @Override
    public List<YwymCode> getCodeByUserId(int userId) {
        YwymCodeExample example = new YwymCodeExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<YwymCode> codes = codeMapper.selectByExample(example);
        return codes;
    }
}
