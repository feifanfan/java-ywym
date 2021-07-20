package com.hackerff.code.mapper;

import com.hackerff.code.model.YwymGoods;
import com.hackerff.code.model.YwymGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YwymGoodsMapper {
    long countByExample(YwymGoodsExample example);

    int deleteByExample(YwymGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YwymGoods record);

    int insertSelective(YwymGoods record);

    List<YwymGoods> selectByExampleWithBLOBs(YwymGoodsExample example);

    List<YwymGoods> selectByExample(YwymGoodsExample example);

    YwymGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YwymGoods record, @Param("example") YwymGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") YwymGoods record, @Param("example") YwymGoodsExample example);

    int updateByExample(@Param("record") YwymGoods record, @Param("example") YwymGoodsExample example);

    int updateByPrimaryKeySelective(YwymGoods record);

    int updateByPrimaryKeyWithBLOBs(YwymGoods record);

    int updateByPrimaryKey(YwymGoods record);
}