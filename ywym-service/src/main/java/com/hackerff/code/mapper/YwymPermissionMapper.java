package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymPermission;
import com.hackerff.code.model.YwymPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymPermissionMapper {
    long countByExample(YwymPermissionExample example);

    int deleteByExample(YwymPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymPermission record);

    int insertSelective(YwymPermission record);

    List<YwymPermission> selectByExample(YwymPermissionExample example);

    YwymPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymPermission record, @Param("example") YwymPermissionExample example);

    int updateByExample(@Param("record") YwymPermission record, @Param("example") YwymPermissionExample example);

    int updateByPrimaryKeySelective(YwymPermission record);

    int updateByPrimaryKey(YwymPermission record);
}