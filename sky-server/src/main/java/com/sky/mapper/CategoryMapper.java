package com.sky.mapper;

import com.sky.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜品及套餐分类 Mapper 接口
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
