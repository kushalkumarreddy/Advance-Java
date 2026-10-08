<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page Context Example</title>
</head>
<body>

<%
String sname = "Kushal";
String city = "HYD";
String course = "Java";

pageContext.setAttribute("studentName", sname);
pageContext.setAttribute("studentCourse", course, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("studentCity", city, PageContext.SESSION_SCOPE);
pageContext.setAttribute("collegeName", "Malla Reddy College", PageContext.APPLICATION_SCOPE);
%>

<%
Object sname1 = pageContext.getAttribute("studentName");
Object city1 = pageContext.getAttribute("studentCity", PageContext.SESSION_SCOPE);
Object course1 = pageContext.getAttribute("studentCourse", PageContext.REQUEST_SCOPE);
Object cname1 = pageContext.getAttribute("collegeName", PageContext.APPLICATION_SCOPE);
%>

<h2>Student Name: <%= sname1 %></h2>
<h2>Student Course: <%= course1 %></h2>
<h2>City: <%= city1 %></h2>
<h2>College Name: <%= cname1 %></h2>

</body>
</html>