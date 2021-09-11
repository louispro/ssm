package com.louis.ssm.dao;

import com.louis.ssm.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @赖小燚
 * @www.louis_lai.com
 */
@Repository
public interface EmployeeDao {

    List<Employee> getAllEmployees();
}
