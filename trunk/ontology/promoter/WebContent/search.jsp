<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="搜索页面" /></title>
</head>
<body>
<s:form action="search.action" validate="true">
	<s:textfield name="username" label="用户名" />
	<s:textfield name="surname" label="姓" />
	<s:textfield name="given_name" lable="名"/>
	<s:textfield name="organization" label="公司" />
	<s:textfield name="phone" label="电话"/>
	<s:submit value="search" />
	<s:reset value="reset" />
</s:form>
</body>
</html>