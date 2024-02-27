package com.pecho.gulimail.coupon.dao;

import com.pecho.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 16:59:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
