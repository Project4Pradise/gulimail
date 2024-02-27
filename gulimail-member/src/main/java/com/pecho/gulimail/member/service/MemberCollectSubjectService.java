package com.pecho.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pecho.common.utils.PageUtils;
import com.pecho.gulimail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:06:08
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

