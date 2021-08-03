package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCodeJob;
import com.hackerff.code.model.YwymCodeJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeJobMapper {
    long countByExample(YwymCodeJobExample example);

    int deleteByExample(YwymCodeJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCodeJob record);

    int insertSelective(YwymCodeJob record);

    List<YwymCodeJob> selectByExample(YwymCodeJobExample example);

    YwymCodeJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCodeJob record, @Param("example") YwymCodeJobExample example);

    int updateByExample(@Param("record") YwymCodeJob record, @Param("example") YwymCodeJobExample example);

    int updateByPrimaryKeySelective(YwymCodeJob record);

    int updateByPrimaryKey(YwymCodeJob record);
}