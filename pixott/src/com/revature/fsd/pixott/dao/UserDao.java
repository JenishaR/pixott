package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.fsd.pixott.model.User;

public class UserDao {
	public void signup(User user) {
		System.out.println("test");
		String sql = "insert into user(name,mobile,password) values (?,?,?)";
		try (Connection conn = Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);) {
			//System.out.println("connected sucessfully.");
			// stmt.setInt(1, .getId());
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getMobile());
			stmt.setString(3, user.getPassword());
			stmt.executeUpdate();
			System.out.println("Signup Successfull.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
		public User getUser(String mobile) {
		
			String sql = "Select * from user where mobile=?";
			try (Connection conn = Util.getConnection();
					PreparedStatement stmt = conn.prepareStatement(sql);) {
				System.out.println("connected sucessfully.");
				stmt.setString(1,mobile);
				
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					User user= new User();
					user.setMobile(rs.getString("mobile"));
					user.setPassword(rs.getString("password"));
					return user;
				}
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			return null;
	}

	public static void main(String args[]) {
		UserDao dao = new UserDao();
		User user = new User();
		// user.setId("01");
		user.setName("john");
		user.setMobile("8976023422");
		user.setPassword("password001");

		dao.signup(user);

	}

}
