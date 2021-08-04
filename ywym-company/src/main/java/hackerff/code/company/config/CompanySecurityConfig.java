package hackerff.code.company.config;

import com.hackerff.code.security.config.SecurityConfig;
import hackerff.code.company.service.CompanyService;
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
 * @date 2021/8/2 16:58
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class CompanySecurityConfig extends SecurityConfig {
    @Autowired
    public CompanyService service;

    @Bean
    public UserDetailsService userDetailsService(){
        return id -> service.loadById(id);
    }
}
