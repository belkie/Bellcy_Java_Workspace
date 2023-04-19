package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dal.helper.MyDBConnection;
import com.dal.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	
	@Override
	public void insertEmployee(Employee emp) {
	     
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("insert into dalemp values(?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from dalemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));				
			}
						
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
	
		try {
			con  = MyDBConnection.getDbConnection();			
			String sql = "UPDATE dalemp SET ename=? WHERE eid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "Johnson");
			pstmt.setInt(2, 101); 
			int rowsAffected = pstmt.executeUpdate();           
            System.out.println(rowsAffected + " existing user record was updated!");
	  
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int eid) {
		    
		try {
			
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();			
			String sql = "delete from dalemp where eid=?";			 
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,101);			 
			int rowsDeleted = ps.executeUpdate();
			System.out.println(rowsDeleted + " user was deleted!");
						
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}