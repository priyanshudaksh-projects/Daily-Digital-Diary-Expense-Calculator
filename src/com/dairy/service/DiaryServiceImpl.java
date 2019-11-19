package com.dairy.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.dairy.controller.DBUtility;
import com.dairy.pojo.Diary;

public class DiaryServiceImpl implements DiaryService {

	@Override
	public int store(Diary diary) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "insert into diary(userid, date, mood, day, extra) values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, diary.getUid());
			pstmt.setDate(2, Date.valueOf(diary.getDate()));
			pstmt.setString(3, diary.getMood());
			pstmt.setString(4, diary.getDay());
			pstmt.setString(5, diary.getExtra());
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
