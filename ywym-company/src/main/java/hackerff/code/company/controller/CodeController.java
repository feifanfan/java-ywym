package hackerff.code.company.controller;

import com.hackerff.code.common.result.CommonResult;
import com.hackerff.code.model.YwymCodeJob;
import hackerff.code.company.service.CodeJobService;
import hackerff.code.company.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 15:32
 */
@RestController
@RequestMapping("/codes")
public class CodeController {
    @Autowired
    private CodeService codeService;
    @Autowired
    private CodeJobService codeJobService;

    @PostMapping("")
    public CommonResult createCodes(@RequestParam int num) throws InterruptedException {
        //TODO 查询上次生成码的时间，1万码控制半分钟
        YwymCodeJob job = codeJobService.getLastJobByCompanyId(1);
        if (job != null && job.getEndTime().after(Calendar.getInstance().getTime())) {
            return CommonResult.failed("请等待上个任务执行完成！");
        }
        codeService.createCodes(num);
        return CommonResult.success(null);
    }
}
