package com.hackerff.code.api.service;

import com.hackerff.code.model.YwymUserCode;

import java.util.List;

public interface UserCodeService {
    YwymUserCode getUserCodeById(int id);
    YwymUserCode getUserCodeByCodeId(int codeId);
    void CollectCode(int userId,int codeId);
    List<YwymUserCode> getUserCodesByUserId(int userId,int page,int pageSize);
}
