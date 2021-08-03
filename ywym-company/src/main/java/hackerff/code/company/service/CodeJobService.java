package hackerff.code.company.service;

import com.hackerff.code.model.YwymCodeJob;

public interface CodeJobService {
    YwymCodeJob getLastJobByCompanyId(int companyId);
    int createCodeJob(YwymCodeJob codeJob);
}
