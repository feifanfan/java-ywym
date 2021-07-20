package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymFormField;
import com.hackerff.code.model.YwymFormFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymFormFieldMapper {
    long countByExample(YwymFormFieldExample example);

    int deleteByExample(YwymFormFieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymFormField record);

    int insertSelective(YwymFormField record);

    List<YwymFormField> selectByExample(YwymFormFieldExample example);

    YwymFormField selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymFormField record, @Param("example") YwymFormFieldExample example);

    int updateByExample(@Param("record") YwymFormField record, @Param("example") YwymFormFieldExample example);

    int updateByPrimaryKeySelective(YwymFormField record);

    int updateByPrimaryKey(YwymFormField record);
}