<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" language="javascript">
	function regist() {
		targetForm = document.forms[0];
		targetForm.action = "login!regist";
	}
	function login() {
		targetForm = document.forms[0];
		targetForm.action = "login!execute";
	}	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="loginPage" /></title>
</head>
<body> 
<table border="1" width="320">
<tr><th>ÓÃ»§Ãû»òÃÜÂë²»ÕýÈ·£¬ÇëÖØÐÂµÇÂ¼£¡</th></tr>
<s:form action="actionName!methodName">
          
	<s:textfield name="username" label="ÓÃ»§Ãû" />
	<s:password name="password" label="ÃÜÂë" />
	<s:submit value="µÇÂ¼" onClick="login()" />
	<s:reset value="ÖØÖÃ"/>
</s:form>
</table>
</body>
</html>