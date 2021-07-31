package com.hackerff.code.api.service;

import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymUserCode;

import java.util.List;

public interface CodeService {
    YwymCode createCode(YwymUserCode code);
    YwymCode getCodeById(int id);
    List<YwymCode> getCodeByUserId(int userId);
}
