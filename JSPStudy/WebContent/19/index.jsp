<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	首页
	<br />
	<br />
	<a href="<%=request.getContextPath()%>/19/hello.jsp">hello.jsp</a>
	<br />
	<%
		String flag = "";
		Object object = session.getAttribute("flag");

		if (object != null) {
			flag = object.toString();
		}

		if (flag.equals("login_success")) {
	%>
	<a href="<%=request.getContextPath()%>/LogoutServlet19">退出</a>
	<%
		} else {
	%>
	<a href="<%=request.getContextPath()%>/19/login.jsp">登录</a>
	<%
		}
	%>
</body>
</html>