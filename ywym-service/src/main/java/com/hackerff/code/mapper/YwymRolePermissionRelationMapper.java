package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymRolePermissionRelation;
import com.hackerff.code.model.YwymRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymRolePermissionRelationMapper {
    long countByExample(YwymRolePermissionRelationExample example);

    int deleteByExample(YwymRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymRolePermissionRelation record);

    int insertSelective(YwymRolePermissionRelation record);

    List<YwymRolePermissionRelation> selectByExample(YwymRolePermissionRelationExample example);

    YwymRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymRolePermissionRelation record, @Param("example") YwymRolePermissionRelationExample example);

    int updateByExample(@Param("record") YwymRolePermissionRelation record, @Param("example") YwymRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(YwymRolePermissionRelation record);

    int updateByPrimaryKey(YwymRolePermissionRelation record);
}