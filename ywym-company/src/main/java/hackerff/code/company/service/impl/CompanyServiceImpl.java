package hackerff.code.company.service.impl;

import com.hackerff.code.mapper.YwymAdminMapper;
import com.hackerff.code.mapper.YwymCompanyMapper;
import com.hackerff.code.model.YwymAdmin;
import com.hackerff.code.model.YwymAdminExample;
import com.hackerff.code.security.util.JwtUtil;
import hackerff.code.company.domain.AdminDetail;
import hackerff.code.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:00
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private YwymAdminMapper adminMapper;

    @Override
    public UserDetails loadById(String id) {
        return new AdminDetail(adminMapper.selectByPrimaryKey(Long.parseLong(id)));
    }

    @Override
    public UserDetails loadByUsername(String username) {
        YwymAdminExample example = new YwymAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<YwymAdmin> admins = adminMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(admins)){
            return new AdminDetail(admins.get(0));
        }
        return null;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        UserDetails userDetails = loadByUsername(username);
        token = jwtUtil.generateToken(userDetails);
        return token;
    }

}
