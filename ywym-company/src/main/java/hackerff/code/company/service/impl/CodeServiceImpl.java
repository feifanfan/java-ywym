package hackerff.code.company.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.IdUtil;
import com.hackerff.code.mapper.YwymCodeJobMapper;
import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymCodeJob;
import hackerff.code.company.dao.YwymCodeDao;
import hackerff.code.company.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

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
    @Autowired
    private YwymCodeJobMapper codeJobMapper;

    @Async
    @Override
    public void createCodes(int codeNum) throws InterruptedException {
        System.out.println("异步任务执行中");
        //1.先写入任务 TODO 替换真实数据
        YwymCodeJob job = new YwymCodeJob();
        job.setCompanyId(1);
        job.setCreateTime(Calendar.getInstance().getTime());
        job.setUserId(2);
        job.setCount(codeNum);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        job.setEndTime(new Date(new Date().getTime()+codeNum));
        codeJobMapper.insert(job);
        YwymCode code;
        //2.写入二维码
        List<YwymCode> list = new ArrayList<>();
        int batNum = codeNum/1000;
        int remain = codeNum%1000;
        for (int j=0;j<batNum;j++){
            for (int i=0;i<1000;i++){
                code = new YwymCode();
                code.setUuid(IdUtil.simpleUUID());
                code.setUserId(1);
                code.setGoodsId(2);
                code.setCompanyId(2);
                code.setLink("http://www.api.code.com/");
                list.add(code);
            }
            codeDao.insertList(list);
            list.clear();
        }
        list.clear();
        for (int re = 0; re < remain; re++) {
            code = new YwymCode();
            code.setUuid(UUID.fastUUID().toString());
            code.setUserId(1);
            code.setGoodsId(2);
            code.setCompanyId(2);
            code.setLink("http://www.api.code.com/");
            list.add(code);
        }
        if(!CollectionUtils.isEmpty(list)){
            codeDao.insertList(list);
        }

        System.out.println("异步任务执行结束");
    }
}
