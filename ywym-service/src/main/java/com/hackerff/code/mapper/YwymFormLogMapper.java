package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymFormLog;
import com.hackerff.code.model.YwymFormLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymFormLogMapper {
    long countByExample(YwymFormLogExample example);

    int deleteByExample(YwymFormLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymFormLog record);

    int insertSelective(YwymFormLog record);

    List<YwymFormLog> selectByExample(YwymFormLogExample example);

    YwymFormLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymFormLog record, @Param("example") YwymFormLogExample example);

    int updateByExample(@Param("record") YwymFormLog record, @Param("example") YwymFormLogExample example);

    int updateByPrimaryKeySelective(YwymFormLog record);

    int updateByPrimaryKey(YwymFormLog record);
}