package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCodeField;
import com.hackerff.code.model.YwymCodeFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeFieldMapper {
    long countByExample(YwymCodeFieldExample example);

    int deleteByExample(YwymCodeFieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCodeField record);

    int insertSelective(YwymCodeField record);

    List<YwymCodeField> selectByExample(YwymCodeFieldExample example);

    YwymCodeField selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCodeField record, @Param("example") YwymCodeFieldExample example);

    int updateByExample(@Param("record") YwymCodeField record, @Param("example") YwymCodeFieldExample example);

    int updateByPrimaryKeySelective(YwymCodeField record);

    int updateByPrimaryKey(YwymCodeField record);
}