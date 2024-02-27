package com.pecho.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pecho.common.utils.PageUtils;
import com.pecho.gulimail.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:06:08
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

