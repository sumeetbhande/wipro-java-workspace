package javaDBconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb";  //MySQLDatabase URL
		 String usern = "root";
		 String pswd = "@Bhande7411";
		 Connection conn = null;
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver"); //Load Driver
			  conn = DriverManager.getConnection(url, usern, pswd);
		      String sql = "insert into users(username, password) values(?,?)";
		      CallableStatement cs = conn.prepareCall(sql);
		      cs.setString(1,  "Jack");
		      cs.setString(2,  "123456");
		      cs.execute();
		      System.out.println("Record Inserted Successfully !!!");
		 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }

}
}
