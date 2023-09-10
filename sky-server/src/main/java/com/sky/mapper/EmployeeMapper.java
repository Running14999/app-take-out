package com.sky.mapper;

import com.sky.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
