package com.hackerff.code.api.service.impl;

import com.hackerff.code.api.domain.UserDetail;
import com.hackerff.code.api.service.UserService;

import com.hackerff.code.mapper.YwymUserMapper;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserExample;
import com.hackerff.code.security.util.JwtUtil;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private YwymUserMapper userMapper;
    @Autowired
    private JwtUtil jwtUtil;
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

    public UserDetails loadUserByOpenid(String openid){
        YwymUser user = getUserByOpenid(openid);
        if (user != null) {
            return  new UserDetail(user);
        }
        throw new UsernameNotFoundException("用户名不存在或密码错误");
    }

    @Override
    public UserDetails loadUserById(String id) {
        UserDetail userDetail = new UserDetail(userMapper.selectByPrimaryKey(Integer.parseInt(id)));
        return userDetail;
    }

    @Override
    public YwymUser getUserByOpenid(String openid) {
        YwymUserExample example = new YwymUserExample();
        example.createCriteria().andOpenidEqualTo(openid);
        List<YwymUser> users = userMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(users)){
            return users.get(0);
        }
        return null;
    }

    @Override
    public YwymUser getUserByOpenidAndAppid(String openid, int appid) {
        YwymUserExample example = new YwymUserExample();
        example.createCriteria().andUniacidEqualTo(appid);
        List<YwymUser> users = userMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(users)){
            return users.get(0);
        }
        return null;
    }

    @Override
    public YwymUser insertUser(String openid,int appid) {
        YwymUser user = new YwymUser();
        user.setOpenid(openid);
        user.setUniacid(appid);
        int userId = userMapper.insert(user);
        user.setId(userId);
        return user;
    }
    public String login(String openid) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetail userDetails = new UserDetail(getUserByOpenid(openid));

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public YwymUser getCurrentUser() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        System.out.println(auth.getPrincipal());
        UserDetail userDetail = (UserDetail) auth.getPrincipal();
        return userDetail.getYwymUser();
    }

    @Override
    public YwymUser setUserInfo(YwymUser user) {
        userMapper.updateByPrimaryKey(user);
        return user;
    }
}
