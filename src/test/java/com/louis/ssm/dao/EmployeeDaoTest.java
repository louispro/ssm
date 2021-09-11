package com.louis.ssm.dao;

import com.louis.ssm.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = "classpath:spring/spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;
    @Test
    public void getAllEmployees() {
        List<Employee> employeeList = employeeDao.getAllEmployees();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}