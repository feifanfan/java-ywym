package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import hackerff.code.company.service.AdminService;
import hackerff.code.company.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:12
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CodeService codeService;

    @GetMapping("")
    public CommonResult adminList(){
        return CommonResult.success("111");
    }

    @PostMapping("/codes")
    public CommonResult createCodes(@RequestParam int num) throws InterruptedException {
        //TODO 查询上次生成码的时间，1万码控制半分钟
        codeService.createCodes(num);
        return CommonResult.success("111");
    }
}
