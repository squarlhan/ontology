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
	<s:textfield name="username" label="�û���" />
	<s:textfield name="surname" label="�ǳ�" />
	<s:password name="password" label="����" />
	<s:password name="repassword" label="ȷ������" />
	<s:textfield name="birth" lable="����"/>
	<s:textfield name="tel" label="�绰" />
	<s:textfield name="question" label="��ȫ����"/>
	<s:textfield name="answer" label="�ش�"/>
	<s:submit value="�ύ" />
	<s:reset value="����" />
</s:form>
</body>
</html>