package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymAdminPermissionRelation;
import com.hackerff.code.model.YwymAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymAdminPermissionRelationMapper {
    long countByExample(YwymAdminPermissionRelationExample example);

    int deleteByExample(YwymAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymAdminPermissionRelation record);

    int insertSelective(YwymAdminPermissionRelation record);

    List<YwymAdminPermissionRelation> selectByExample(YwymAdminPermissionRelationExample example);

    YwymAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymAdminPermissionRelation record, @Param("example") YwymAdminPermissionRelationExample example);

    int updateByExample(@Param("record") YwymAdminPermissionRelation record, @Param("example") YwymAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(YwymAdminPermissionRelation record);

    int updateByPrimaryKey(YwymAdminPermissionRelation record);
}