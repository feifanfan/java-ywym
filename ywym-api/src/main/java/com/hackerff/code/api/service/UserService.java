package com.hackerff.code.api.service;

import com.hackerff.code.model.YwymUser;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/15 11:06
 */
public interface UserService {
    YwymUser user();
    UserDetails loadUserByUsername(String username);
}
