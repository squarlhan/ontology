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
	function forgetpassword() {
		targetForm = document.form[0];
		targetForm.action = "login!forgetPassword";

	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title><s:text name="loginPage" /></title>
</head>
<body>
<s:form action="actionName!methodName">
	<s:textfield name="username" label="用户名" />
	<s:password name="password" label="密码" />
	<s:submit value="登录" onClick="login()" />
	<s:submit value="注册" onClick="regist()" />

	<s:submit value="忘记密码" onClick="forgetpassword()" />
	<s:reset value="重置" />
</s:form>

</body>
</html>