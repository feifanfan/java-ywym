package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymActivity;
import com.hackerff.code.model.YwymActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymActivityMapper {
    long countByExample(YwymActivityExample example);

    int deleteByExample(YwymActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymActivity record);

    int insertSelective(YwymActivity record);

    List<YwymActivity> selectByExample(YwymActivityExample example);

    YwymActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymActivity record, @Param("example") YwymActivityExample example);

    int updateByExample(@Param("record") YwymActivity record, @Param("example") YwymActivityExample example);

    int updateByPrimaryKeySelective(YwymActivity record);

    int updateByPrimaryKey(YwymActivity record);
}