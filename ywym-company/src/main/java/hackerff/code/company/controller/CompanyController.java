package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import hackerff.code.company.service.CodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private CodeService codeService;

    @ApiOperation("获取列表")
    @GetMapping("/list")
    public CommonResult adminList() {
        return CommonResult.success("111");
    }

}
