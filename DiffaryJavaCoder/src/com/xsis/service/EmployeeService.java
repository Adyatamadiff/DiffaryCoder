package com.xsis.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.Employee;

public class EmployeeService {

	// Get Data
	public Employee getEmployeeById(int id) {
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee emp = new Employee();
		try {
			ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
			ps.setInt(1, id);
			rs = ps.executeQuery();

			// Extract
			while (rs.next()) { // Jika rs mendapatkan data dari database
				emp.setName(rs.getString("first_name"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return emp;
	}

	public List<Employee> getAllEMployee() {
		String sql = "SELECT * FROM EMPLOYEES";

		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = DbUtils.getPreparedStatement(sql, DbUtils.getConnect());
			rs = ps.executeQuery();

			// Extract
			while (rs.next()) { // Jika rs mendapatkan data dari database
				Employee emp = new Employee();
				emp.setName(rs.getString("first_name"));
				listEmp.add(emp);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listEmp;
	}
}