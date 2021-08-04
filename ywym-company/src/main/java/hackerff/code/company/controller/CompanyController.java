package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import hackerff.code.company.dto.LoginParam;
import hackerff.code.company.service.CodeService;
import hackerff.code.company.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:12
 */
@Api("companyController")
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("login")
    public CommonResult login(@RequestBody LoginParam param){
       String token = companyService.login(param.getUsername(), param.getPassword());
       return CommonResult.success(token);
    }

}
