package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymActivityRedpack;
import com.hackerff.code.model.YwymActivityRedpackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymActivityRedpackMapper {
    long countByExample(YwymActivityRedpackExample example);

    int deleteByExample(YwymActivityRedpackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymActivityRedpack record);

    int insertSelective(YwymActivityRedpack record);

    List<YwymActivityRedpack> selectByExample(YwymActivityRedpackExample example);

    YwymActivityRedpack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymActivityRedpack record, @Param("example") YwymActivityRedpackExample example);

    int updateByExample(@Param("record") YwymActivityRedpack record, @Param("example") YwymActivityRedpackExample example);

    int updateByPrimaryKeySelective(YwymActivityRedpack record);

    int updateByPrimaryKey(YwymActivityRedpack record);
}