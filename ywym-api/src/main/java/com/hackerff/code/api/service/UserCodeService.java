package com.hackerff.code.api.service;

import com.hackerff.code.model.YwymUserCode;

public interface UserCodeService {
    YwymUserCode getUserCodeById(int id);
    YwymUserCode getUserCodeByCodeId(int codeId);
}
