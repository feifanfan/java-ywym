package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymUserCodeLog;
import com.hackerff.code.model.YwymUserCodeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymUserCodeLogMapper {
    long countByExample(YwymUserCodeLogExample example);

    int deleteByExample(YwymUserCodeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymUserCodeLog record);

    int insertSelective(YwymUserCodeLog record);

    List<YwymUserCodeLog> selectByExample(YwymUserCodeLogExample example);

    YwymUserCodeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymUserCodeLog record, @Param("example") YwymUserCodeLogExample example);

    int updateByExample(@Param("record") YwymUserCodeLog record, @Param("example") YwymUserCodeLogExample example);

    int updateByPrimaryKeySelective(YwymUserCodeLog record);

    int updateByPrimaryKey(YwymUserCodeLog record);
}