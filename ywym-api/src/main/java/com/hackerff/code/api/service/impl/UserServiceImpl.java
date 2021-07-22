package com.hackerff.code.api.service.impl;

import com.hackerff.code.api.domain.UserDetail;
import com.hackerff.code.api.service.UserService;

import com.hackerff.code.mapper.YwymUserMapper;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/15 11:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private YwymUserMapper userMapper;

    @Override
    public YwymUser user() {
        return userMapper.selectByPrimaryKey(1);
    }

    public YwymUser getByUsername(String username) {

        YwymUserExample example = new YwymUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<YwymUser> users = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(users)) {
            YwymUser user = users.get(0);
            return user;
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        YwymUser user = getByUsername(username);
        if (user != null) {
            return  new UserDetail(user);
        }
        throw new UsernameNotFoundException("用户名不存在或密码错误");
    }
}
