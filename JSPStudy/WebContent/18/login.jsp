<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(form) {
		if(document.forms.loginFrom.username.value==""){
			alert("please input username");
			document.forms.loginForm.username.focus();
			return false;
		}
		
		if(document.forms.loginFrom.password.value==""){
			alert("please input password");
			document.forms.loginForm.password.focus();
			return false;
			
		}
	}
</script>
</head>
<body>
	<form action="<%= request.getContextPath()%>/checkServlet"
		method="post" name="loginForm">
		<table>
			<tr>
				<td>username：</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>password：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" onclick="return check(this);"/></td>
			</tr>
		</table>
	</form>
</body>
</html>