package com.pecho.gulimail.order.dao;

import com.pecho.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:18:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
