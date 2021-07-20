package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymActivityMiniProgram;
import com.hackerff.code.model.YwymActivityMiniProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymActivityMiniProgramMapper {
    long countByExample(YwymActivityMiniProgramExample example);

    int deleteByExample(YwymActivityMiniProgramExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymActivityMiniProgram record);

    int insertSelective(YwymActivityMiniProgram record);

    List<YwymActivityMiniProgram> selectByExample(YwymActivityMiniProgramExample example);

    YwymActivityMiniProgram selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymActivityMiniProgram record, @Param("example") YwymActivityMiniProgramExample example);

    int updateByExample(@Param("record") YwymActivityMiniProgram record, @Param("example") YwymActivityMiniProgramExample example);

    int updateByPrimaryKeySelective(YwymActivityMiniProgram record);

    int updateByPrimaryKey(YwymActivityMiniProgram record);
}