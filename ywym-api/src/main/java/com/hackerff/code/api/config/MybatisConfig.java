package com.hackerff.code.api.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.hackerff.code.mapper")
public class MybatisConfig {
}
