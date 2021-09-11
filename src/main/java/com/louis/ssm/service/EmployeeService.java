package com.louis.ssm.service;

import com.louis.ssm.bean.Employee;
import com.louis.ssm.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @赖小燚
 * @www.louis_lai.com
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
}
