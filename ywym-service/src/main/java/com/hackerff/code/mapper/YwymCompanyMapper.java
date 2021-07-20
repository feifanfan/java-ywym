package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCompany;
import com.hackerff.code.model.YwymCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCompanyMapper {
    long countByExample(YwymCompanyExample example);

    int deleteByExample(YwymCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCompany record);

    int insertSelective(YwymCompany record);

    List<YwymCompany> selectByExampleWithBLOBs(YwymCompanyExample example);

    List<YwymCompany> selectByExample(YwymCompanyExample example);

    YwymCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCompany record, @Param("example") YwymCompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") YwymCompany record, @Param("example") YwymCompanyExample example);

    int updateByExample(@Param("record") YwymCompany record, @Param("example") YwymCompanyExample example);

    int updateByPrimaryKeySelective(YwymCompany record);

    int updateByPrimaryKeyWithBLOBs(YwymCompany record);

    int updateByPrimaryKey(YwymCompany record);
}