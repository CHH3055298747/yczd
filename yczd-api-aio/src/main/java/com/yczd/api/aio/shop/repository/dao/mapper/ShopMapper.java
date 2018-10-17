package com.yczd.api.aio.shop.repository.dao.mapper;

import com.yczd.api.aio.shop.domain.Shop;
import com.yczd.api.aio.shop.domain.ShopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShopMapper {
    long countByExample(ShopCriteria example);

    int deleteByExample(ShopCriteria example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExampleWithRowbounds(ShopCriteria example, RowBounds rowBounds);

    List<Shop> selectByExample(ShopCriteria example);

    Shop selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopCriteria example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopCriteria example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}