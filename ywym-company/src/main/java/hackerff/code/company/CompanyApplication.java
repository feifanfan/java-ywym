package hackerff.code.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:09
 */
@SpringBootApplication
@EnableAsync
public class CompanyApplication {
    public static void main(String args[]){
        SpringApplication.run(CompanyApplication.class);
    }
}
