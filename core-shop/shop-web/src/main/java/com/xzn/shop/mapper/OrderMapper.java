package com.xzn.shop.mapper;

import com.xzn.shop.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    TOrder selectByUserId(@Param("userId") Long userId);

    void insert(@Param("order") TOrder order);

}
