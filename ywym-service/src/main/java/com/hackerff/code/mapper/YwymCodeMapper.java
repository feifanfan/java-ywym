package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCode;
import com.hackerff.code.model.YwymCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeMapper {
    long countByExample(YwymCodeExample example);

    int deleteByExample(YwymCodeExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(YwymCode record);

    int insertSelective(YwymCode record);

    List<YwymCode> selectByExample(YwymCodeExample example);

    YwymCode selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") YwymCode record, @Param("example") YwymCodeExample example);

    int updateByExample(@Param("record") YwymCode record, @Param("example") YwymCodeExample example);

    int updateByPrimaryKeySelective(YwymCode record);

    int updateByPrimaryKey(YwymCode record);
}