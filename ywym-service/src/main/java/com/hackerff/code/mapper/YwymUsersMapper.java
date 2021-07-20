package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymUsers;
import com.hackerff.code.model.YwymUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymUsersMapper {
    long countByExample(YwymUsersExample example);

    int deleteByExample(YwymUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymUsers record);

    int insertSelective(YwymUsers record);

    List<YwymUsers> selectByExample(YwymUsersExample example);

    YwymUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymUsers record, @Param("example") YwymUsersExample example);

    int updateByExample(@Param("record") YwymUsers record, @Param("example") YwymUsersExample example);

    int updateByPrimaryKeySelective(YwymUsers record);

    int updateByPrimaryKey(YwymUsers record);
}