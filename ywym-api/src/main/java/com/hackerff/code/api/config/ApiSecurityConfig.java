package com.hackerff.code.api.config;

import com.hackerff.code.api.service.UserService;
import com.hackerff.code.security.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/7/21 16:11
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApiSecurityConfig extends SecurityConfig {
    @Autowired
    private UserService userService;

    @Bean
    public UserDetailsService userDetailsService(){
        return id -> userService.loadUserById(id);
    }
}
