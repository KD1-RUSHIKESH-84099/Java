package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.entity.Student;
import com.sunbeam.utils.Dbutil;

public class StudentDao implements AutoCloseable {
	
	private Connection connection;
	
	public StudentDao() throws SQLException {
		connection = Dbutil.getConnection();
	}
	
	public List<Student> getAllStudents() throws SQLException{
		List<Student> studentList = new ArrayList<>();
		String sql = "SELECT * FROM student";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Student student = new Student();
			student.setRollno(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setMarks(rs.getDouble(3));
			student.setMobile(rs.getString(4));
			studentList.add(student);
		}
		return studentList;
		
		
		
	}
	
	public String deleteStudent(int rollNo) throws SQLException {
		
		String sql = "DELETE FROM student WHERE rollno = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, rollNo);
		stmt.executeUpdate();		
		return "Student Deleted successfully";
		
		
	}
	
	public String insertStudent(Student s) throws SQLException {
		
		String sql = "INSERT INTO student (name, marks, mobile) VALUES(?, ?, ?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, s.getName());
		stmt.setDouble(2, s.getMarks());
		stmt.setString(3, s.getMobile());
		stmt.executeUpdate();
		
		return "STUDENT ADDED SUCCESFULLY";
		
		
	}
	
	public String updateStudent(int rollNo , double marks ) throws SQLException {
		
		String sql = "UPDATE student SET marks = ? WHERE rollno = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setDouble(1, marks);
			stmt.setInt(2, rollNo);
			stmt.executeUpdate();
		}
		return "student update succesfully";
		
		
	}
	
	

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public Student getStudent(int rollno) throws SQLException {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM student WHERE rollno = ?";
		    PreparedStatement stmt = connection.prepareStatement(sql);
		    stmt.setInt(1, rollno);
		    ResultSet rs = stmt.executeQuery();

		    if (rs.next()) {
		        Student student = new Student();
		        student.setRollno(rs.getInt("rollno"));
		        student.setName(rs.getString("name"));
		        student.setMarks(rs.getDouble("marks"));
		        student.setMobile(rs.getString("mobile"));
		        return student;
		    }
		    return null;
	}
	
	
	
	

}
