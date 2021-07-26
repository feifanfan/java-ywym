package com.hackerff.code.api.domain;

import com.hackerff.code.model.YwymUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/21 17:02
 */
public class UserDetail implements UserDetails {
    private YwymUser ywymUser;
    public UserDetail(YwymUser ywymUser){
        this.ywymUser = ywymUser;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return Arrays.asList(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return ywymUser.getPassword();
    }

    @Override
    public String getUsername() {
        return ywymUser.getId().toString();
    }
    public String getOpenid(){
        return  ywymUser.getOpenid();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return  true;
    }
    public YwymUser getYwymUser(){
        return ywymUser;
    }
}
