<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="loginPage"/></title>

</head>
<body>
<s:form action="login">
<s:textfield name="username" label="用户名"/>
<s:textfield name="password" label="密码"/>
<s:submit  value = "提交"/>

</s:form>
</body>
</html>