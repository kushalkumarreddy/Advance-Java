
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f1f5f9;
            text-align: center;
            padding-top: 100px;
        }

        .message {
            display: inline-block;
            background: white;
            padding: 35px;
            border-radius: 10px;
            box-shadow: 0 4px 15px #0002;
        }

        h2 {
            color: #15803d;
        }

        a {
            color: #2563eb;
        }
    </style>
</head>
<body>

    <div class="message">
        <h2>Registration Successful!</h2>
        <p>Your details have been saved to the database.</p>
        <a href="${pageContext.request.contextPath}/userRegistration.jsp">
            Register Another User
        </a>
    </div>

</body>
</html>
	