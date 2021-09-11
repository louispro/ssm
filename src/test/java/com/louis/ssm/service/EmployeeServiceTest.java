package com.louis.ssm.service;

import com.louis.ssm.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@ContextConfiguration(locations = "classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}