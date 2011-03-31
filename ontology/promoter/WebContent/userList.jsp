<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员页面</title>
</head>
<body>
<table >
<thead>用户信息列表</thead>

<tr>
	<td>Id</td>
	<td>Email</td>
	<td>Surname</td>
	<td>GivenName</td>
	<td>Organization</td>
	<td>Phone</td>
	<td>Role</td>
	<td>Operations</td>
</tr>
<s:iterator value="users" status="stat">
<tr>
	<td><s:property value="id"></s:property></td>
	<td><s:property value="email"></s:property></td>
	<td><s:property value="surname"></s:property></td>
	<td><s:property value="givenname"></s:property></td>
	<td><s:property value="organization"></s:property></td>
	<td><s:property value="id"></s:property></td>
	<td><s:property value="userRole.role"></s:property></td>
	<td>Operations</td>
</tr>
</s:iterator>
</table>
</body>
</html>