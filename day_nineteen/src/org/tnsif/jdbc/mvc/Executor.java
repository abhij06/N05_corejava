package org.tnsif.jdbc.mvc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Executor {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		StudentServiceImpl service=new StudentServiceImpl();
		List<Student> studList=new ArrayList<Student>();
		int n;
		Student st;
		try {
			
			
			/*
			 * service.addStudent(new Student(1, "Abhishek",(float) 98.25));
			 * service.addStudent(new Student(2, "Diksha",(float) 75.22));
			 * service.addStudent(new Student(3, "Rupesh",(float) 80.82));
			 * service.addStudent(new Student(4, "Yash",(float) 77.02));
			 * service.addStudent(new Student(5, "Mavshi",(float) 45.22));
			 */
			
			studList=service.getAllStudents();
			service.display(studList);
			//System.out.println(studList.isEmpty()?"NO students available":"---All Students----\n"+studList);
			
			
			//studList=service.getStudentsByPer((float) 75.05);
			//System.out.println(studList);
			//System.out.println();
			

			//studList=service.getStudentsNameStartsWith("a%");
			//System.out.println(studList);
			//System.out.println();
			
			
			/*
			 * System.out.println("--------------------"); n=service.deleteAllStudents();
			 * System.out.println(n>0?n+"record(s) deleted sucessfully":"Empty Table");
			 */
			 
			/*
			 * n=service.deleteByRollNo(6); service.display(studList);
			 * System.out.println("--------------------");
			 */
			
			System.out.println("--------------------");
			  //n=service.updateStudentPer(3); 
			  //service.display(studList);
			 
			
			
			
				/*
				 * n=service.updateStudentPerByRollNo(1, 45.23f); service.display(studList);
				 */

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
