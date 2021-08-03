package hackerff.code.company.service.impl;

import com.hackerff.code.mapper.YwymCodeJobMapper;
import com.hackerff.code.model.YwymCodeJob;
import com.hackerff.code.model.YwymCodeJobExample;
import hackerff.code.company.service.CodeJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 15:46
 */
@Service
public class CodeJobServiceImpl implements CodeJobService {
    @Autowired
    private YwymCodeJobMapper codeJobMapper;

    @Override
    public YwymCodeJob getLastJobByCompanyId(int companyId) {
        YwymCodeJobExample example = new YwymCodeJobExample();
        example.createCriteria().andCompanyIdEqualTo(companyId);
        example.setOrderByClause("create_time desc");
        List<YwymCodeJob> codeJobs = codeJobMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(codeJobs)){
            return codeJobs.get(0);
        }
        return null;
    }

    @Override
    public int createCodeJob(YwymCodeJob codeJob) {
        return  codeJobMapper.insert(codeJob);
    }
}
