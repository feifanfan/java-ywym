package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymUser;
import com.hackerff.code.model.YwymUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface YwymUserMapper {
    long countByExample(YwymUserExample example);

    int deleteByExample(YwymUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymUser record);

    int insertSelective(YwymUser record);

    List<YwymUser> selectByExample(YwymUserExample example);

    YwymUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymUser record, @Param("example") YwymUserExample example);

    int updateByExample(@Param("record") YwymUser record, @Param("example") YwymUserExample example);

    int updateByPrimaryKeySelective(YwymUser record);

    int updateByPrimaryKey(YwymUser record);
}