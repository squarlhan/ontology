<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="changepassPage" /></title>
</head>
<body>
<s:form action="changepass.action">

	<s:textfield name="password" label="newpass" />
	<s:textfield name="repassword" label="confirmpass" />

	<s:submit value="submit" />
	<s:reset value="reset" />
</s:form>

</body>
</html>