package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymCodeTask;
import com.hackerff.code.model.YwymCodeTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymCodeTaskMapper {
    long countByExample(YwymCodeTaskExample example);

    int deleteByExample(YwymCodeTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymCodeTask record);

    int insertSelective(YwymCodeTask record);

    List<YwymCodeTask> selectByExample(YwymCodeTaskExample example);

    YwymCodeTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymCodeTask record, @Param("example") YwymCodeTaskExample example);

    int updateByExample(@Param("record") YwymCodeTask record, @Param("example") YwymCodeTaskExample example);

    int updateByPrimaryKeySelective(YwymCodeTask record);

    int updateByPrimaryKey(YwymCodeTask record);
}