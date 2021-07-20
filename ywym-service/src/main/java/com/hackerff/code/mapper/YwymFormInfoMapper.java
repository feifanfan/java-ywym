package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymFormInfo;
import com.hackerff.code.model.YwymFormInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymFormInfoMapper {
    long countByExample(YwymFormInfoExample example);

    int deleteByExample(YwymFormInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymFormInfo record);

    int insertSelective(YwymFormInfo record);

    List<YwymFormInfo> selectByExample(YwymFormInfoExample example);

    YwymFormInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymFormInfo record, @Param("example") YwymFormInfoExample example);

    int updateByExample(@Param("record") YwymFormInfo record, @Param("example") YwymFormInfoExample example);

    int updateByPrimaryKeySelective(YwymFormInfo record);

    int updateByPrimaryKey(YwymFormInfo record);
}