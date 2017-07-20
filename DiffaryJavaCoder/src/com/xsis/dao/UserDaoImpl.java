package com.xsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.xsis.dbconnect.DbUtils;
import com.xsis.entity.User;

public class UserDaoImpl implements UserDao {

	Connection con = DbUtils.getConnect();
	private static final String SQL_SAVE = "INSERT INTO XSIS_USER (id, name, address, no_session) "
			+ "values (SEQ_PI.nextval, ?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM XSIS_USER WHERE ID = ?";
	private static final String SQL_GETALLUSER = "SELECT * FROM XSIS_USER";

	@Override
	public void save(User usr) {
		// TODO Auto-generated method stub
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_SAVE, con);
		try {
			ps.setString(1, usr.getName());
			ps.setString(2, usr.getAddress());
			ps.setString(3, usr.getNo_session());
			ps.executeUpdate();
			System.out.println(usr.getName() + " Berhasil diinput ke database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, User usr) {
		// TODO Auto-generated method stub
		String SQL_UPDATE = "UPDATE XSIS_USER SET name = ? , address = ? , no_session = ? WHERE id = " + id;
		PreparedStatement ps = DbUtils.getPreparedStatement(SQL_UPDATE, con);
		try {
			ps.setString(1, usr.getName());
			ps.setString(2, usr.getAddress());
			ps.setString(3, usr.getNo_session());
			ps.executeUpdate();
			System.out.println(usr.getName() + " Berhasil diupdate");
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
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> listUsr = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = DbUtils.getPreparedStatement(SQL_GETALLUSER, con);
			rs = ps.executeQuery();

			while (rs.next()) {
				User usr = new User();
				usr.setId(rs.getInt("id"));
				usr.setName(rs.getString("name"));
				usr.setAddress(rs.getString("address"));
				usr.setNo_session(rs.getString("no_session"));
				listUsr.add(usr);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listUsr;
	}
}