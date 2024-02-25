package library.model;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private String email;
	private String contact;
	private ArrayList book;
	
	public Student()
	{
		
	}
	
	public Student(int id,String name,String email,String contact)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.contact=contact;	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	
	// Student array get and set.
	public ArrayList getBook() {
		return book;
	}

	public void setBook(ArrayList book) {
		this.book = book;
	}
	
	
}
