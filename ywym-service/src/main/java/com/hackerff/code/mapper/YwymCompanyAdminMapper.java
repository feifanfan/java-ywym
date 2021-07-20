package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCompanyAdmin;
import com.hackerff.code.model.YwymCompanyAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCompanyAdminMapper {
    long countByExample(YwymCompanyAdminExample example);

    int deleteByExample(YwymCompanyAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCompanyAdmin record);

    int insertSelective(YwymCompanyAdmin record);

    List<YwymCompanyAdmin> selectByExample(YwymCompanyAdminExample example);

    YwymCompanyAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCompanyAdmin record, @Param("example") YwymCompanyAdminExample example);

    int updateByExample(@Param("record") YwymCompanyAdmin record, @Param("example") YwymCompanyAdminExample example);

    int updateByPrimaryKeySelective(YwymCompanyAdmin record);

    int updateByPrimaryKey(YwymCompanyAdmin record);
}