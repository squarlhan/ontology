<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登陆页面</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="管理员登陆页面" /></title>
</head>
<body>
<s:form action="adminlogin">
<s:textfield label="用户名" name="email"></s:textfield>
<s:password label="密码" name="password"></s:password>
<s:submit label="提交"></s:submit>
<s:reset label="重置"></s:reset>
</s:form>
</body>
</html>