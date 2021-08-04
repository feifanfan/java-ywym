package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/4 16:59
 */
@RestController
@RequestMapping("/form")
public class FormController {
    @GetMapping("")
    public CommonResult list(){
        return CommonResult.success("ddd");
    }
}
