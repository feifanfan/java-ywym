package hackerff.code.company.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.hackerff.code.mapper","hackerff.code.company.dao"})
public class MybatisConfig {
}
