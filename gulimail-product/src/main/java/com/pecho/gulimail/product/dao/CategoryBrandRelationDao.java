package com.pecho.gulimail.product.dao;

import com.pecho.gulimail.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author pecho
 * @email sunlightcs@gmail.com
 * @date 2024-02-26 16:13:03
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
