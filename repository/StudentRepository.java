package library.repository;

import java.util.ArrayList;

import library.model.Student;

public class StudentRepository {
	static ArrayList als=new ArrayList();

	public int getid() {
		
		return als.size();
	}

	// Add object in Arraylist.
	public boolean isAddStudent(Student s) {
		boolean b=als.add(s);
		return b;
	}

	// Displaye method
	public ArrayList getAllStudent() {
		
		return als;
	}
	
	

}
