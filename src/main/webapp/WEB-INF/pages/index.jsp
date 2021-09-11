<%--
  Created by IntelliJ IDEA.
  User: louis_lai
  Date: 2021/9/11
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<h2>员工列表</h2>
<table border="1px" cellpadding="5px" cellspacing="0px">
    <tr>
        <th>员工ID</th>
        <th>姓名</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>部门ID</th>
        <th>部门</th>
    </tr>
    <c:forEach items="${employees}" var="emp">
        <tr>
            <td>${emp.employeeId}</td>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.gender == 1?"男":"女"}</td>
            <td>${emp.departmentId}</td>
            <td>${emp.departmentName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
