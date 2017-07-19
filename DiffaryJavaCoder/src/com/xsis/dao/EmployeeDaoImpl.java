package com.xsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection con = DbUtils.getConnect();
	private static final String SQL_SAVE = "INSERT INTO XSIS_EMPLOYEE (id, name, address, salary, nohp) "
			+ "values (xsis.nextval, ?, ?, ?, ?)"; // Java ConstantA
	private static final String SQL_GETALLEMPLOYEE = "SELECT * FROM XSIS_EMPLOYEE";
	private static final String SQL_DELETE = "DELETE FROM XSIS_EMPLOYEE WHERE ID = ?";
	private static final String SQL_GETBYNAME = "SELECT * FROM XSIS_EMPLOYEE WHERE upper(name) = upper(?)";

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_SAVE, con);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNohp());
			ps.executeUpdate();
			System.out.println(emp.getName() + " Berhasil diinput ke database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Employee emp) {
		// TODO Auto-generated method stub
		String SQL_UPDATE = "UPDATE XSIS_EMPLOYEE SET name = ? , address = ? , salary = ? , nohp = ? WHERE id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_UPDATE, con);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNohp());
			ps.executeUpdate();
			System.out.println(emp.getName() + " Berhasil diupdate");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_DELETE, con);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("ID " + id + " Berhasil dihapus");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub

		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = DbUtils.getPreparedStatement(SQL_GETBYNAME, con);
			ps.setString(1, name);
			rs = ps.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setNohp(rs.getString("nohp"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAddress(rs.getString("address"));
				listEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listEmp;
	}

	@Override
	public Employee searchEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> listEmp = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = DbUtils.getPreparedStatement(SQL_GETALLEMPLOYEE, con);
			rs = ps.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setNohp(rs.getString("nohp"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAddress(rs.getString("address"));
				listEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listEmp;
	}
}