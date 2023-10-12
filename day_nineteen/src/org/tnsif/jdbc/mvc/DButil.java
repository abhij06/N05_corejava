package org.tnsif.jdbc.mvc;
import java.sql.*;
import java.io.*;
import java.util.Properties;


public class DButil {
	static Connection cn;
	static
	{
		
		Properties prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src/db.properties"));
			Class.forName(prop.getProperty("driver_name"));
			//establish connection
		   cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			
			System.out.println("Connection Establish");
		}
		catch (IOException | ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getCn()
	{
		return cn;
	}
}
