package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymFormFieldData;
import com.hackerff.code.model.YwymFormFieldDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymFormFieldDataMapper {
    long countByExample(YwymFormFieldDataExample example);

    int deleteByExample(YwymFormFieldDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymFormFieldData record);

    int insertSelective(YwymFormFieldData record);

    List<YwymFormFieldData> selectByExample(YwymFormFieldDataExample example);

    YwymFormFieldData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymFormFieldData record, @Param("example") YwymFormFieldDataExample example);

    int updateByExample(@Param("record") YwymFormFieldData record, @Param("example") YwymFormFieldDataExample example);

    int updateByPrimaryKeySelective(YwymFormFieldData record);

    int updateByPrimaryKey(YwymFormFieldData record);
}