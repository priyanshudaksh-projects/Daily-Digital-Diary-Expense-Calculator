package com.dairy.service;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.dairy.controller.DBUtility;
import com.dairy.pojo.ExpenseDetails;

public class ExpenseServiceImpl implements ExpenseService {

	@Override
	public int SaveExpense(ExpenseDetails exp) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "insert into expenses(userid, date, food, golgappa, transport, other, reason, total) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, exp.getUserid());
			pstmt.setDate(2, Date.valueOf(exp.getDate()));
			pstmt.setInt(3, exp.getFood());
			pstmt.setInt(4, exp.getGolgappa());
			pstmt.setInt(5, exp.getTransport());
			pstmt.setInt(6, exp.getOther());
			pstmt.setString(7, exp.getReason());
			pstmt.setInt(8, exp.getTotal());
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<ExpenseDetails> FetchExpense(int uid) {
		List<ExpenseDetails> exp = new ArrayList<ExpenseDetails>();	
		try {
			Connection con = DBUtility.establishConnection();
			String query = "select * from expenses where userid = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, uid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ExpenseDetails expense = new ExpenseDetails(rs.getInt(1), rs.getInt(2), rs.getDate(3).toLocalDate(), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
				exp.add(expense);
			}
			con.close();
			rs.close();
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return  exp;	
	}
}
