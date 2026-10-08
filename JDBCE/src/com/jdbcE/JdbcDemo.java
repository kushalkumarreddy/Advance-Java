package com.jdbcE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws Exception {

        // Step 1: Register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered");

        // Step 2: Establish connection
        String url = "jdbc:mysql://localhost:3306/jfs56";
        String uname = "root";
        String pwd = "root";

        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection established");

        // Step 3: Create statement
        Statement stmt = con.createStatement();
        System.out.println("Statement created successfully");

        // Step 4: Create SQL query
        String qry = "CREATE TABLE dept (did INT, dname VARCHAR(20))";

        // Step 5: Execute query
        stmt.execute(qry);
        System.out.println("Table created successfully");

        // Step 6: Close resources
        stmt.close();
        con.close();

        System.out.println("Connection closed");
    }
}