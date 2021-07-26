package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymMiniapp;
import com.hackerff.code.model.YwymMiniappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymMiniappMapper {
    long countByExample(YwymMiniappExample example);

    int deleteByExample(YwymMiniappExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymMiniapp record);

    int insertSelective(YwymMiniapp record);

    List<YwymMiniapp> selectByExample(YwymMiniappExample example);

    YwymMiniapp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymMiniapp record, @Param("example") YwymMiniappExample example);

    int updateByExample(@Param("record") YwymMiniapp record, @Param("example") YwymMiniappExample example);

    int updateByPrimaryKeySelective(YwymMiniapp record);

    int updateByPrimaryKey(YwymMiniapp record);
}