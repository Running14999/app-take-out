package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sky.result.Result;
import com.sky.vo.EmployeeLoginVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息 服务类
 * </p>
 *
 * @author saber
 * @since 2023-09-09
 */
@Service
public interface EmployeeService extends IService<Employee> {

   public EmployeeLoginVO login(EmployeeLoginDTO employeeLoginDTO);

    public Result save(EmployeeDTO employeeDTO);
}
