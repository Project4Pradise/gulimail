package com.pecho.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pecho.common.utils.PageUtils;
import com.pecho.gulimail.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 16:59:04
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

