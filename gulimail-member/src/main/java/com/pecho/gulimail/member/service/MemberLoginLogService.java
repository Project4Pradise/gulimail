package com.pecho.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pecho.common.utils.PageUtils;
import com.pecho.gulimail.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:06:08
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

