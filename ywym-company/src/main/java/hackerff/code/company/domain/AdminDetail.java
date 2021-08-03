package hackerff.code.company.domain;

import com.hackerff.code.model.YwymAdmin;
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
public class AdminDetail implements UserDetails {
    private YwymAdmin ywymAdmin;
    public AdminDetail(YwymAdmin ywymAdmin){
        this.ywymAdmin = ywymAdmin;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return Arrays.asList(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return ywymAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return ywymAdmin.getId().toString();
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
    public YwymAdmin getYwymAdmin(){
        return ywymAdmin;
    }
}
