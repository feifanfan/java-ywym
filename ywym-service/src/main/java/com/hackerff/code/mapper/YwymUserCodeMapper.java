package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymUserCode;
import com.hackerff.code.model.YwymUserCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymUserCodeMapper {
    long countByExample(YwymUserCodeExample example);

    int deleteByExample(YwymUserCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymUserCode record);

    int insertSelective(YwymUserCode record);

    List<YwymUserCode> selectByExample(YwymUserCodeExample example);

    YwymUserCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymUserCode record, @Param("example") YwymUserCodeExample example);

    int updateByExample(@Param("record") YwymUserCode record, @Param("example") YwymUserCodeExample example);

    int updateByPrimaryKeySelective(YwymUserCode record);

    int updateByPrimaryKey(YwymUserCode record);
}