package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymForm;
import com.hackerff.code.model.YwymFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymFormMapper {
    long countByExample(YwymFormExample example);

    int deleteByExample(YwymFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymForm record);

    int insertSelective(YwymForm record);

    List<YwymForm> selectByExample(YwymFormExample example);

    YwymForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymForm record, @Param("example") YwymFormExample example);

    int updateByExample(@Param("record") YwymForm record, @Param("example") YwymFormExample example);

    int updateByPrimaryKeySelective(YwymForm record);

    int updateByPrimaryKey(YwymForm record);
}