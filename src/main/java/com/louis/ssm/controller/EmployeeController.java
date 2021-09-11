package com.louis.ssm.controller;

import com.louis.ssm.bean.Employee;
import com.louis.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @赖小燚
 * @www.louis_lai.com
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("empList")
    public String empList(Model model){
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees",employees);
        return "index";
    }

}
