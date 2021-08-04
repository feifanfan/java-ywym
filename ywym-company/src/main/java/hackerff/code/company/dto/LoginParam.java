package hackerff.code.company.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/4 17:03
 */
@Data
public class LoginParam {
    @NotEmpty
    @ApiModelProperty(value = "用户名",required = true)
    private String username;

    @NotEmpty
    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
