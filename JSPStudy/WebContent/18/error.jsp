<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
error info:<br/>
<%
Object object = request.getParameter("msg");
if(object!=null){
	
	out.println(object.toString());
}
%>
username: <%= request.getParameter("username") %><br/>
password: <%= request.getParameter("password") %><br/>
<a href="<%= request.getContextPath() %>/18/login.jsp">back</a>
</body>
</html>