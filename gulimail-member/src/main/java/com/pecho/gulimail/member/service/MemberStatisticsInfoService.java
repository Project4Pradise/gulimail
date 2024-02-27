package com.pecho.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pecho.common.utils.PageUtils;
import com.pecho.gulimail.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:06:07
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

