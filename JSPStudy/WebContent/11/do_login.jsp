<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String username = request.getParameter("username");
 String password = request.getParameter("password");
 
 session.setAttribute("username", username);
 response.setHeader("refresh","2,URL=welcome.jsp");
 %>