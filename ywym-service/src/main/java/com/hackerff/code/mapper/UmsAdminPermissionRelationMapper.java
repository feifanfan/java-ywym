package com.hackerff.code.mapper;

import com.hackerff.code.model.UmsAdminPermissionRelation;
import com.hackerff.code.model.UmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionRelationMapper {
    long countByExample(UmsAdminPermissionRelationExample example);

    int deleteByExample(UmsAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}