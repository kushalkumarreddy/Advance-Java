<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    String bankName = application.getInitParameter("bankName");
    String bankAddress = application.getInitParameter("bankAddress");
%>

<h2><%= bankName %></h2>

<p><%= bankAddress %></p>

<hr>

</body>
</html>