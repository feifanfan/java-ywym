package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCodeLog;
import com.hackerff.code.model.YwymCodeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeLogMapper {
    long countByExample(YwymCodeLogExample example);

    int deleteByExample(YwymCodeLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCodeLog record);

    int insertSelective(YwymCodeLog record);

    List<YwymCodeLog> selectByExample(YwymCodeLogExample example);

    YwymCodeLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCodeLog record, @Param("example") YwymCodeLogExample example);

    int updateByExample(@Param("record") YwymCodeLog record, @Param("example") YwymCodeLogExample example);

    int updateByPrimaryKeySelective(YwymCodeLog record);

    int updateByPrimaryKey(YwymCodeLog record);
}