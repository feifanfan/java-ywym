package hackerff.code.company.service;

import com.hackerff.code.model.YwymAdmin;
import com.hackerff.code.model.YwymCompany;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 16:59
 */
public interface CompanyService {
    UserDetails loadById(String id);
    UserDetails loadByUsername(String username);
    String login(String username,String password);
}
