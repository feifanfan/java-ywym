package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymRole;
import com.hackerff.code.model.YwymRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymRoleMapper {
    long countByExample(YwymRoleExample example);

    int deleteByExample(YwymRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymRole record);

    int insertSelective(YwymRole record);

    List<YwymRole> selectByExample(YwymRoleExample example);

    YwymRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymRole record, @Param("example") YwymRoleExample example);

    int updateByExample(@Param("record") YwymRole record, @Param("example") YwymRoleExample example);

    int updateByPrimaryKeySelective(YwymRole record);

    int updateByPrimaryKey(YwymRole record);
}