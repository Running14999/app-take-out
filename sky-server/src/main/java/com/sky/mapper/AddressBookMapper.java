package com.sky.mapper;

import com.sky.entity.AddressBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 地址簿 Mapper 接口
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}
