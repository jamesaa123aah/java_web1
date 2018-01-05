<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--<jsp:forward page="login.jsp"></jsp:forward>-->

<jsp:forward page="login.jsp">
	<jsp:param value="123" name="username"/>
	<jsp:param value="333" name="password"/>
</jsp:forward>