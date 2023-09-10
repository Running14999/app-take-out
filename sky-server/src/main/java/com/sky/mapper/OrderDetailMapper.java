package com.sky.mapper;

import com.sky.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单明细表 Mapper 接口
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}
