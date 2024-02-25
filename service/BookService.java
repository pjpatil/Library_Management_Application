package library.service;

import java.util.ArrayList;

import library.model.Book;
import library.repository.BookRepository;


//   It is buisness logic
public class BookService {
	BookRepository bRepo=new BookRepository();
	
	public boolean isAddBook(Book b) {
		int bId=bRepo.getbId();
		bId=bId+1;
		b.setbId(bId);
		boolean bl=bRepo.isAddBook(b);
		return bl;
	}

	public ArrayList getAllBooks() {
		ArrayList al=bRepo.getAllBooks();
		return al.size()>0 ?al:null;
	}
}
