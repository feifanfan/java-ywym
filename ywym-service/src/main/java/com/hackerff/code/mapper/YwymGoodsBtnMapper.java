package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymGoodsBtn;
import com.hackerff.code.model.YwymGoodsBtnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymGoodsBtnMapper {
    long countByExample(YwymGoodsBtnExample example);

    int deleteByExample(YwymGoodsBtnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymGoodsBtn record);

    int insertSelective(YwymGoodsBtn record);

    List<YwymGoodsBtn> selectByExample(YwymGoodsBtnExample example);

    YwymGoodsBtn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymGoodsBtn record, @Param("example") YwymGoodsBtnExample example);

    int updateByExample(@Param("record") YwymGoodsBtn record, @Param("example") YwymGoodsBtnExample example);

    int updateByPrimaryKeySelective(YwymGoodsBtn record);

    int updateByPrimaryKey(YwymGoodsBtn record);
}