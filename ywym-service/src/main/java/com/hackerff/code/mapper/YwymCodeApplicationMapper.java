package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCodeApplication;
import com.hackerff.code.model.YwymCodeApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeApplicationMapper {
    long countByExample(YwymCodeApplicationExample example);

    int deleteByExample(YwymCodeApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCodeApplication record);

    int insertSelective(YwymCodeApplication record);

    List<YwymCodeApplication> selectByExample(YwymCodeApplicationExample example);

    int updateByExampleSelective(@Param("record") YwymCodeApplication record, @Param("example") YwymCodeApplicationExample example);

    int updateByExample(@Param("record") YwymCodeApplication record, @Param("example") YwymCodeApplicationExample example);
}