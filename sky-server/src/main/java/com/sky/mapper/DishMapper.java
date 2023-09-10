package com.sky.mapper;

import com.sky.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 菜品 Mapper 接口
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}
