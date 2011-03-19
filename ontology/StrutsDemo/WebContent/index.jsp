<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
   <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="adminLogin" theme="simple">
<table><tr><td>
user</td><td><s:textfield name="username"></s:textfield></td></tr>
<tr><td>password</td><td><s:password name="password" label=""></s:password>
<s:submit value="tijiao"></s:submit></td></tr></table>

</s:form>
</body>
</html>