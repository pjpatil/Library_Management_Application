package library.repository;

import java.util.ArrayList;
import java.util.Collections;

import library.model.Book;

public class BookRepository {

	static ArrayList al=new ArrayList();  // Store book information.
	public int getbId() {
		return al.size();
	}
	
	public boolean isAddBook(Book b)
	{
		boolean bl=al.add(b);
		return bl;
	}

	public ArrayList getAllBooks() {
		
		return al;
	}
	
}
