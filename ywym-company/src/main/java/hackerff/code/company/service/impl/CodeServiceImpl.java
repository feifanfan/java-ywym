package hackerff.code.company.service.impl;

import cn.hutool.core.lang.UUID;
import com.hackerff.code.model.YwymCode;
import hackerff.code.company.dao.YwymCodeDao;
import hackerff.code.company.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/2 17:30
 */
@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    private YwymCodeDao codeDao;

    @Async
    @Override
    public void createCodes(int codeNum) throws InterruptedException {
        System.out.println("异步任务执行中");
        YwymCode code = new YwymCode();
        List<YwymCode> list = new ArrayList<>();
        int batNum = codeNum/1000;
        int remain = codeNum%1000;
        System.out.println(remain);
        for (int j=0;j<batNum;j++){
            list.clear();
            for (int i=0;i<1000;i++){
                code.setUuid(UUID.fastUUID().toString());
                code.setUserId(1);
                code.setGoodsId(2);
                code.setCompanyId(2);
                code.setLink("http://www.api.code.com/");
                list.add(code);
            }
            codeDao.insertList(list);
        }
        list.clear();
        for (int re = 0; re < remain; re++) {
            code.setUuid(UUID.fastUUID().toString());
            code.setUserId(1);
            code.setGoodsId(2);
            code.setCompanyId(2);
            code.setLink("http://www.api.code.com/");
            list.add(code);
        }
        codeDao.insertList(list);

        Thread.sleep(1000);
        System.out.println("异步任务执行结束");
    }
}
