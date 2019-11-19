package com.dairy.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.dairy.controller.DBUtility;
import com.dairy.pojo.User;
public class UserServiceImpl implements UserService {

	@Override
	public User login(String email, String password) {
		User user = null;
		try { 
			Connection con = DBUtility.establishConnection();
			String query = "select * from user_details where email = ? and password = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getDate(5).toLocalDate(), rs.getString(6));
			}
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
						
		}
		return  user;
	}

}
