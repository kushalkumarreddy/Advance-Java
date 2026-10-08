<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%!
    // Declaration
    public String checkName(String name) {

        if (name.length() % 2 == 0) {
            return "Even number of characters";
        } else {
            return "Odd number of characters";
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>

    <h2>Employee Registration Details</h2>

    <%
        // Scriptlet

        String name = request.getParameter("empName");
        String department = request.getParameter("department");
        String salary = request.getParameter("salary");

        double sal = Double.parseDouble(salary);

        String salaryMessage;

        if (sal >= 30000) {
            salaryMessage = "Salary is acceptable";
        } else {
            salaryMessage = "Salary is below 30000";
        }
    %>

    <p>
        Employee Name:
        <%= name %>
    </p>

    <p>
        Department:
        <%= department %>
    </p>

    <p>
        Salary:
        <%= salary %>
    </p>

    <p>
        Name Character Check:
        <%= checkName(name) %>
    </p>

    <p>
        Salary Check:
        <%= salaryMessage %>
    </p>

</body>
</html>