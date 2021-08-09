package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/4 16:59
 */
@RestController
public class FormController {

    @GetMapping("/form")
    public CommonResult list(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "15") int pageSize) {
        return null;
    }

    @GetMapping("/form/{id}")
    public CommonResult detail(@PathVariable int id) {
        return null;
    }

    public CommonResult create() {
        return null;
    }

}
