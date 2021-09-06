package com.um21.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class EmployeeDao {
	HashMap<Integer,EmployeeDto> hash = new HashMap<>();
	public HashMap<Integer,EmployeeDto> viewEmployees() throws SQLException{
		EmployeeDto empdto = new EmployeeDto();
		
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * from emp";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);

		int empId;
		String firstName;
		String lastName;
		float salary;
		int mobile;
		String dept;

		while (rs.next()) {
			empId = rs.getInt(1);
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
		
			empdto.setEmpId(empId);
			empdto.setFirstName(firstName);
			empdto.setLastName(lastName);
			empdto.setSalary(salary);
			empdto.setMobile(mobile);
			empdto.setDept(dept);
			
			hash.put(empId,empdto);
			
			
	}
		return hash;
	} 
	

}
