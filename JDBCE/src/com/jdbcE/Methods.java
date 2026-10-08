package com.jdbcE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Methods {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver registered");
        
        String url = "jdbc:mysql://localhost:3306/jfs56";
        String uname = "root";
        String pwd = "root";
        
        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connection established");
        
        Statement stmt = con.createStatement();
        System.out.println("Statement created successfully");
        
        String qry = "select * from products";
        
        ResultSet res = stmt.executeQuery(qry);
        
        while(res.next()) {
        	System.out.println(res.getInt("product_id")+" "+res.getString("product_name")+" "+res.getString("price"));
        } 
        
        stmt.close();
        con.close();

	}

}
