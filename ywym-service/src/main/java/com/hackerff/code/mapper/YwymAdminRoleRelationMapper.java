package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymAdminRoleRelation;
import com.hackerff.code.model.YwymAdminRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymAdminRoleRelationMapper {
    long countByExample(YwymAdminRoleRelationExample example);

    int deleteByExample(YwymAdminRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymAdminRoleRelation record);

    int insertSelective(YwymAdminRoleRelation record);

    List<YwymAdminRoleRelation> selectByExample(YwymAdminRoleRelationExample example);

    YwymAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymAdminRoleRelation record, @Param("example") YwymAdminRoleRelationExample example);

    int updateByExample(@Param("record") YwymAdminRoleRelation record, @Param("example") YwymAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(YwymAdminRoleRelation record);

    int updateByPrimaryKey(YwymAdminRoleRelation record);
}