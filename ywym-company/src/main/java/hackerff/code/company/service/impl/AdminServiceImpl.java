package hackerff.code.company.service.impl;

import com.hackerff.code.model.YwymAdmin;
import hackerff.code.company.service.AdminService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:00
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Override
    public UserDetails loadById(String id) {
        return null;
    }

    @Override
    public UserDetails loadByUsername(String username) {
        return null;
    }
}
