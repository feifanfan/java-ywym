package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymAdmin;
import com.hackerff.code.model.YwymAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymAdminMapper {
    long countByExample(YwymAdminExample example);

    int deleteByExample(YwymAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(YwymAdmin record);

    int insertSelective(YwymAdmin record);

    List<YwymAdmin> selectByExample(YwymAdminExample example);

    YwymAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") YwymAdmin record, @Param("example") YwymAdminExample example);

    int updateByExample(@Param("record") YwymAdmin record, @Param("example") YwymAdminExample example);

    int updateByPrimaryKeySelective(YwymAdmin record);

    int updateByPrimaryKey(YwymAdmin record);
}