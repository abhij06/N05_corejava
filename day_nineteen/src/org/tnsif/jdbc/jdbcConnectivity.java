package org.tnsif.jdbc;

import java.sql.*;  
public class jdbcConnectivity
{  
		public static void main(String args[])throws Exception
		{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root",""); 
				System.out.println("Conncetion Sucessfully");
				//here jdbc is database name, root is username and password  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("SELECT * FROM student");  
				while(rs.next())  
					{
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));  
					}	
				rs.close();
				
				//Inserting data
				/*int n=stmt.executeUpdate("INSERT INTO student VALUES(5,'Rupali',40)");
				if(n==1)
				{
					System.out.println("Data Inserted");
				}
				else
				{
					System.out.println("Data not Inserted");
				}*/
				//delete record
				int n1=stmt.executeUpdate("DELETE FROM student WHERE sname like 'n%'");
				if(n1>=1)
				{
					System.out.println("Data deleted");
				}
				else
				{
					System.out.println("No such Data found");
				}
				
				//update
				int n4=stmt.executeUpdate("UPDATE student SET per=per+10 WHERE per<90");
				if(n4>=1)
				{
					System.out.println("Updated Sucessfully");
				}
				else
				{
					System.out.println("No such Data found");
				}
				con.close();  
			 
		}  
}