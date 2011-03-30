<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="findPage" /></title>
</head>
<body>
<s:form action="regist.action">
	<s:textfield name="username" label="用户名" />
	<s:textfield name="surname" label="昵称" />
	<s:textfield name="question" label="安全提问" />
	<s:textfield name="answer" label="回答" />
	<s:submit value="提交" />
	<s:reset value="重置" />
</s:form>

</body>
</html>