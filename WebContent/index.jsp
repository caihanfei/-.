<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>学号</th>
		</tr>
		<c:forEach items="${list}" var="student">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
				<td>${student.sex }</td>
				<td>${student.number }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>