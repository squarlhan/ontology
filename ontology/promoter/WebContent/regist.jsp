<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="registPage" /></title>
</head>
<body>
<s:form action="regist.action" validate="true">
	<s:textfield name="username" label="用户名" />
	<s:textfield name="surname" label="昵称" />
	<s:password name="password" label="密码" />
	<s:password name="repassword" label="确认密码" />
	<s:textfield name="birth" lable="生日"/>
	<s:textfield name="tel" label="电话" />
	<s:textfield name="question" label="安全提问"/>
	<s:textfield name="answer" label="回答"/>
	<s:submit value="提交" />
	<s:reset value="重置" />
</s:form>
</body>
</html>