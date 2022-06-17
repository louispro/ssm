package com.louis.ssm.bean;

/**
 * @赖小燚
 * @www.louis_lai.com
 */
public class Employee {

    /**
     *
     */
    private Integer employeeId;
    private String name;
    private String email;
    private Integer gender;
    private Integer departmentId;
    private String departmentName;

    public Employee() {
    }

    public Employee(Integer employeeId, String name, String email, Integer gender, Integer departmentId, String departmentName) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
