<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" language="javascript">
function changepass() {
	targetForm = document.forms[0];
	targetForm.action = "changepass!change";
}
</script>
<!--  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
<title><s:text name="succPage"/></title>
</head>
<body>
${sessionScope.username}已成功登录<br>
${requestScope.tip}
<s:form action="actionName!methodName">

<s:submit value="更改密码" onClick="changepass()" />
</s:form>
</body>
</html>