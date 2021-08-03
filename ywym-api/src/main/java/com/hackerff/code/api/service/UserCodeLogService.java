package com.hackerff.code.api.service;

import com.github.pagehelper.PageInfo;
import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserCodeLog;

import java.util.List;

public interface UserCodeLogService {
    YwymUserCodeLog getLogByUserIdAndCodeId(int userId,int codeId);
    YwymUserCodeLog insertLog(YwymUser user,YwymCode code);
    List<YwymUserCodeLog> getLogsByUserId(int userId, int page, int pageSize);
}
