package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymAction;
import com.hackerff.code.model.YwymActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymActionMapper {
    long countByExample(YwymActionExample example);

    int deleteByExample(YwymActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymAction record);

    int insertSelective(YwymAction record);

    List<YwymAction> selectByExample(YwymActionExample example);

    YwymAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymAction record, @Param("example") YwymActionExample example);

    int updateByExample(@Param("record") YwymAction record, @Param("example") YwymActionExample example);

    int updateByPrimaryKeySelective(YwymAction record);

    int updateByPrimaryKey(YwymAction record);
}