package library.service;

import java.util.ArrayList;

import library.model.Book;
import library.model.Student;
import library.repository.BookRepository;
import library.repository.StudentRepository;

public class StudentService {
	StudentRepository sRepo=new StudentRepository();
	BookRepository br = new BookRepository();
	public boolean isAddStudent(Student s)
	{
		int id=sRepo.getid();
		id=id+1;
		s.setId(id);
		
		boolean b=sRepo.isAddStudent(s);
		return b;
	}

	public ArrayList getAllStudent() {
		ArrayList als=sRepo.getAllStudent();       // call Repository
		return als.size()>0 ?als:null;
	}
	
}
