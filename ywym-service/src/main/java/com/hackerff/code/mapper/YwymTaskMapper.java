package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymTask;
import com.hackerff.code.model.YwymTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymTaskMapper {
    long countByExample(YwymTaskExample example);

    int deleteByExample(YwymTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymTask record);

    int insertSelective(YwymTask record);

    List<YwymTask> selectByExample(YwymTaskExample example);

    YwymTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymTask record, @Param("example") YwymTaskExample example);

    int updateByExample(@Param("record") YwymTask record, @Param("example") YwymTaskExample example);

    int updateByPrimaryKeySelective(YwymTask record);

    int updateByPrimaryKey(YwymTask record);
}