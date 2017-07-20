package com.xsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Connection con = DbUtils.getConnect();
	private String SQL_SAVE = "INSERT INTO XSIS_CUSTOMER (id, name, address, nohp) " + "values (SEQ_DI.nextval, ?, ?, ?)";
	private String SQL_DELETE = "DELETE FROM XSIS_CUSTOMER WHERE ID = ?";
	private String SQL_GETALLCUS = "SELECT * FROM XSIS_CUSTOMER";

	@Override
	public void save(Customer cus) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_SAVE, con);
		try {
			ps.setString(1, cus.getName());
			ps.setString(2, cus.getAddress());
			ps.setString(3, cus.getNohp());
			ps.executeUpdate();
			System.out.println(cus.getName() + " Berhasil diinput ke database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Customer cus) {
		// TODO Auto-generated method stub
		String SQL_UPDATE = "UPDATE XSIS_CUSTOMER SET name = ? , address = ? , nohp = ? WHERE id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_UPDATE, con);
		try {
			ps.setString(1, cus.getName());
			ps.setString(2, cus.getAddress());
			ps.setString(3, cus.getNohp());
			ps.executeUpdate();
			System.out.println(cus.getName() + " Berhasil diupdate");
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
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> listCus = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = DbUtils.getPreparedStatement(SQL_GETALLCUS, con);
			rs = ps.executeQuery();

			while (rs.next()) {
				Customer cus = new Customer();
				cus.setId(rs.getInt("id"));
				cus.setName(rs.getString("name"));
				cus.setAddress(rs.getString("address"));
				cus.setNohp(rs.getString("nohp"));
				listCus.add(cus);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listCus;
	}
}