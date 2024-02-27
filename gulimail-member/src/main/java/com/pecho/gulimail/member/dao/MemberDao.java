package com.pecho.gulimail.member.dao;

import com.pecho.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 17:06:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
