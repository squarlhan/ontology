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
	<s:textfield name="username" label="�û���" />
	<s:textfield name="surname" label="�ǳ�" />
	<s:textfield name="question" label="��ȫ����" />
	<s:textfield name="answer" label="�ش�" />
	<s:submit value="�ύ" />
	<s:reset value="����" />
</s:form>

</body>
</html>