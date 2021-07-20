package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCompanyRole;
import com.hackerff.code.model.YwymCompanyRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCompanyRoleMapper {
    long countByExample(YwymCompanyRoleExample example);

    int deleteByExample(YwymCompanyRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCompanyRole record);

    int insertSelective(YwymCompanyRole record);

    List<YwymCompanyRole> selectByExample(YwymCompanyRoleExample example);

    YwymCompanyRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCompanyRole record, @Param("example") YwymCompanyRoleExample example);

    int updateByExample(@Param("record") YwymCompanyRole record, @Param("example") YwymCompanyRoleExample example);

    int updateByPrimaryKeySelective(YwymCompanyRole record);

    int updateByPrimaryKey(YwymCompanyRole record);
}