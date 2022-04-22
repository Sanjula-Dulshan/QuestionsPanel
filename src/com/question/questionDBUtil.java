package com.question;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class questionDBUtil {
	
	public static boolean isSuccess = false;
	private static ResultSet rs = null;
	private static Connection con = null;
	private static Statement stmt = null;
	
	
	//insert part
	public static boolean insertquestion(String subject, String question, String answer1, String answer2, String answer3, String answer4, String cAnswer) {
		

		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO questiontbl VALUES (0, '"+subject+"', curdate(), '"+question+"', '"+answer1+"', '"+answer2+"', '"+answer3+"', '"+answer4+"', '"+cAnswer+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs == 1) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
	//Read part
	public static List<Question> questionlist(){
		
		ArrayList<Question> ques = new ArrayList<>();

		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM questiontbl";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String subName = rs.getString(2);
				String qDate = rs.getString(3);
				String question = rs.getString(4);
				String answer1 = rs.getString(5);
				String answer2 = rs.getString(6);
				String answer3 = rs.getString(7);
				String answer4 = rs.getString(8);
				String correctAnswer = rs.getString(9);
				
				Question q = new Question(id, subName, qDate, question, answer1, answer2, answer3, answer4, correctAnswer);
				ques.add(q);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ques;
	}
	
	public static List<Question> questionDetails(String id){
		
		int intID = Integer.parseInt(id);
		ArrayList<Question> ques = new ArrayList<>();

		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM questiontbl WHERE questionID = '"+intID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String subName = rs.getString(2);
				String qDate = rs.getString(3);
				String question = rs.getString(4);
				String answer1 = rs.getString(5);
				String answer2 = rs.getString(6);
				String answer3 = rs.getString(7);
				String answer4 = rs.getString(8);
				String correctAnswer = rs.getString(9);
				
				Question q = new Question(intID,subName, qDate, question, answer1, answer2, answer3, answer4, correctAnswer);
				ques.add(q);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ques;
	}
	
	//Update part
	
	public static boolean updatequestion(String id, String subject, String question, String answer1, String answer2, String answer3, String answer4, String cAnswer) {
		

		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE questiontbl SET subName = '"+subject+"', question = '"+question+"', answer1 = '"+answer1+"', answer2 = '"+answer2+"', answer3 = '"+answer3+"', answer4 = '"+answer4+"', correctAnswer = '"+cAnswer+"'"
					+ "WHERE questionID = "+id+"";
			int rs = stmt.executeUpdate(sql);
			
			if(rs == 1) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
	public static boolean deletequestion(String id) {
		//int intID = Integer.parseInt("id");
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM questiontbl WHERE questionID= "+id+"";
			int rs = stmt.executeUpdate(sql);
			
			if(rs == 1) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	

}
