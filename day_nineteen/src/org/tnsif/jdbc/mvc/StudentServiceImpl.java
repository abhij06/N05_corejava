package org.tnsif.jdbc.mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class StudentServiceImpl implements IStudentService 
{
	Connection cn;
	Statement stmt;
	PreparedStatement pst;
	public StudentServiceImpl() throws SQLException
	{
		cn=DButil.getCn();
		stmt=(Statement) cn.createStatement();
	}
	
	@Override
	public void addStudent(Student student) throws SQLException {
		pst=(PreparedStatement) cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1,student.getRollNo());
		pst.setString(2,student.getSname());
		pst.setFloat(3,student.getPer());
		@SuppressWarnings("unused")
		int n=pst.executeUpdate();
		System.out.println("Student Added");
		
	}

	@Override
	public List<Student> getAllStudents() throws SQLException  {
		List<Student> studList=new ArrayList<Student>();
		ResultSet rs=(ResultSet) stmt.executeQuery("SELECT * FROM student");
		while (rs.next())
		{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
		}
		rs.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsByPer(float value) throws SQLException {
		List<Student> studList=new ArrayList<Student>();
		pst=(PreparedStatement) cn.prepareStatement("SELECT * FROM student WHERE per>=?");
		pst.setFloat(1, value);
		ResultSet rs=(ResultSet) pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
			
		}
		pst.close();
		return studList;
	}

	@Override
	public List<Student> getStudentsNameStartsWith(String str) throws SQLException {
		List<Student> studList=new ArrayList<Student>();
		pst=(PreparedStatement) cn.prepareStatement("SELECT * FROM student WHERE sname LIKE ?");
		pst.setString(1, str);
		ResultSet rs=(ResultSet) pst.executeQuery();
		while(rs.next())
		{
			Student st=new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			studList.add(st);
			
		}
		pst.close();
		return studList;
		
	}

	@Override
	public int deleteAllStudents() throws SQLException {
		int no=stmt.executeUpdate("DELETE FROM student");
		
		return no;
	}

	@Override
	public int deleteByRollNo(int value) throws SQLException {
		int n=stmt.executeUpdate("DELETE FROM student WHERE rollno="+value);
		return n;
	}

	@Override
	public int updateStudentPer(float value) throws SQLException {
		pst=(PreparedStatement) cn.prepareStatement("UPDATE student SET per=per+? WHERE per<=?");
		pst.setFloat(1, value);
		pst.setFloat(2, 100-value);
		int n=pst.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rvalue ,float pvalue) throws SQLException {
		pst=(PreparedStatement) cn.prepareStatement("UPDATE student SET per=? WHERE rollNO=?");
		pst.setFloat(1, pvalue);
		pst.setInt(2, rvalue);
		int n=pst.executeUpdate();
		return n;
	}
	
	@Override
	protected void finalize()
	{
		try {
			cn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	void display(List<Student>list)
	{
		Iterator<Student> it=list.iterator();
		System.out.println("id \tsname \tpercentage");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
