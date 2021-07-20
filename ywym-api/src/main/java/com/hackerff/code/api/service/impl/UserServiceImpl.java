package com.hackerff.code.api.service.impl;

import com.hackerff.code.api.service.UserService;

import com.hackerff.code.mapper.YwymUsersMapper;
import com.hackerff.code.model.YwymUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/15 11:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private YwymUsersMapper ywymUsersMapper;
    @Override
    public YwymUsers user() {
        return ywymUsersMapper.selectByPrimaryKey(1);
    }
}
