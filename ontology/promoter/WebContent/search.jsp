<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="����ҳ��" /></title>
</head>
<body>
<s:form action="search.action" validate="true">
	<s:textfield name="username" label="�û���" />
	<s:textfield name="surname" label="��" />
	<s:textfield name="given_name" lable="��"/>
	<s:textfield name="organization" label="��˾" />
	<s:textfield name="phone" label="�绰"/>
	<s:submit value="search" />
	<s:reset value="reset" />
</s:form>
</body>
</html>