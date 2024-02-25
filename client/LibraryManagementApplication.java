package library.client;

import java.util.*;

import library.model.Book;
import library.model.Student;
import library.service.BookService;
import library.service.StudentService;

public class LibraryManagementApplication {
	public static void main(String[] args) {
		BookService bService = new BookService(); // use case 1,
		
		StudentService sService = new StudentService(); // use case 6,

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("+------------------- Library Management Application ------------------------+");
			System.out.println("|\t 1: Add New Book.                                                   |");
			System.out.println("|\t 2: View all Books.                                                 |");
			System.out.println("|\t 3: Count Category wise books.                                      |");
			System.out.println("|\t 4: Display Category wise books with info.                          |");
			System.out.println("|\t 5: Display author wise books                                       |");
			System.out.println("|\t 6: Add New Students(sid, name, email, contact ,ArrayList<Book>)    |");
			System.out.println("|\t 7: Issue book to students.                                         |");
			System.out.println("|\t 8: Show Stock after book issue.                                    |");
			System.out.println("|\t 9: View student wise books.                                        |");
			System.out.println("|\t 10:Delete book by author.                                          |");
			System.out.println("+---------------------------------------------------------------------------+");
			System.out.println("Enter your choice:)");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1: // 1. Add New Books in Collection (book info – id, name, author, pub,
					// price,category, status)
				System.out.println("Enter Book Id:");
				int bId = sc.nextInt();

				sc.nextLine();
				System.out.println("Enter book Name:");
				String bName = sc.nextLine();

				System.out.println("Enter book Author:");
				String bAuthor = sc.nextLine();

				System.out.println("Enter book Price:");
				String bPrice = sc.nextLine();

				System.out.println("Enter book Status:");
				String bStatus = sc.nextLine();

				System.out.println("Enter book Category:");
				String bCategory = sc.nextLine();

				Book b = new Book(bId, bName, bAuthor, bPrice, bStatus, bCategory);        // set data to book class
				// bService.isAddBook(b);

				boolean bl = bService.isAddBook(b);
				if (bl) 
				{
					System.out.println("Book added success...!");
				} 
				else 
				{
					System.out.println("Some problem...");
				}

				break;

			case 2: // 2. View All Books
				ArrayList al = bService.getAllBooks();
				if (al != null) 
				{
					// System.out.println("Book Id:\t Book Name: \t Author: \t Price: \t Status: \t
					// Category:");
					for (Object obj : al) 
					{
						Book bk = (Book) obj;
						System.out.println(bk.getbId() + "\t" + bk.getbName() + "\t\t" + bk.getbAuthor() + "\t"+ bk.getbPrice() + "\t" + bk.getbStatus() + "\t" + bk.getbCategory());
					}
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("\tTotal books is:" + al.size());
				}
				break;

			case 3: // 3. Count Category wise books
				/*
				 * al=bService.getAllBooks();
				 * 
				 * if(al!=null) { boolean flag=false; for(int i=0;i<al.size();i++) { int
				 * count=1; Book bk=(Book) al.get(i);
				 * //if(bk.getbCategory().equalsIgnoreCase(bCategory)) for(int
				 * j=i+1;j<al.size();j++) { Book inner=(Book)al.get(j);
				 * if(inner.getbCategory().equalsIgnoreCase(bk.getbCategory())) { count++; } }
				 * System.out.println(i+" is count "+ count); }
				 * 
				 * } else { System.out.println("There are no books Present in Library..."); }
				 */
				al = bService.getAllBooks();                          // use case 2 
				int index = 0;
				for (Object obj : al)
				{
					b = (Book) obj;                               // object 1 temparary    
					String cat = b.getbCategory();
					int count = 0;
					for (int i = index; i < al.size(); i++) 
					{
						Object obj1 = al.get(i);                 // Object 2 temparary 
						Book b1 = (Book) obj1;
						if (b1.getbCategory().equals(cat))          
						{
							count++;
						}
					}
					
					boolean flag = true;
					for (int j = 0; j < index; j++) 
					{
				 		Object obj1 = al.get(j);
						Book b1 = (Book) obj1;
						if (b1.getbCategory().equals(cat)) 
						{
							flag = false;
							break;
						}
					}
					if (flag) 
					{
						System.out.println("category: " + cat + "\tCount: " + count);
					}
					index++;
				}
				break;

			case 4: // 4. Display Category wise books with info
			/*	sc.nextLine();
				System.out.println("Enter book category:");
				String cat = sc.nextLine();

				al = bService.getAllBooks();

				if (al != null) 
				{
					int count1 = 0;
					for (int i = 0; i < al.size(); i++) 
					{
						Book bo = (Book) al.get(i);
						if (bo.getbCategory().equalsIgnoreCase(cat))            // compares two strings 
						{
							count1++;
						}

					}
					System.out.println("Category of  " + cat + "  has " + count1 + " books are present in Library.");

				} 
				else 
				{
					System.out.println("There are no books Present in Library...");
				}
*/
				al = bService.getAllBooks();                          // use case 2 
				int index1 = 0;
				for (Object obj : al)
				{
					b = (Book) obj;                               // object 1 temparary    
					String cat = b.getbCategory();

					for (int i = index1; i < al.size(); i++) 
					{
						Object obj1 = al.get(i);                 // Object 2 temparary 
						Book b1 = (Book) obj1;
						if (b1.getbCategory().equals(cat))          
						{
							System.out.println(b1.getbCategory()+"\t"+b1.getbId()+"\t"+b1.getbName()+"\t"+b1.getbAuthor()+"\t"+b1.getbPrice());
						}
					}
					index1++;
				}
				break;

			case 5: // 5. Display author wise books
				/*
				 * sc.nextLine(); System.out.println("Enter book category:"); String
				 * auto=sc.nextLine();
				 * 
				 * al=bService.getAllBooks();
				 * 
				 * if(al!=null) { int count=0; for(int i=0;i<al.size();i++) { Book
				 * bo=(Book)al.get(i); if(bo.getbCategory().equalsIgnoreCase(cat)) { count++; }
				 * 
				 * } System.out.println("Category of  "+cat+"  has "
				 * +count+" books are present in Library.");
				 * 
				 * } else { System.out.println("There are no books Present in Library..."); }
				 * System.out.println("No data.!");
				 */
				
				al = bService.getAllBooks();                          // use case 2 
				int index2 = 0;
				for (Object obj : al)
				{
					b = (Book) obj;                               // object 1 temparary    
					String author = b.getbAuthor();

					for (int i = index2; i < al.size(); i++) 
					{
						Object obj1 = al.get(i);                 // Object 2 temparary 
						Book b1 = (Book) obj1;
						if (b1.getbAuthor().equals(author))          
						{
							System.out.println(b1.getbAuthor()+"\t"+b1.getbId()+"\t"+b1.getbName()+"\t"+b1.getbPrice()+"\t"+b1.getbCategory());
						}
					}
					index2++;
				}
				break;

			case 6: // 6. Add New Students (sid, name, email, contact ,ArrayList<Book>)
				System.out.println("Enter Student id:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student name:");
				String name = sc.nextLine();

				System.out.println("Enter Student Email:");
				String email = sc.nextLine();

				System.out.println("Enter Student Contact:");
				String contact = sc.nextLine();

				Student s = new Student(id, name, email, contact);
				// sService.isAddStudent(s);

				boolean bs = sService.isAddStudent(s);
				if (bs) 
				{
					System.out.println("Student added success...!");
				} 
				else 
				{
					System.out.println("Some problem...");
				}

				break;

			case 7: // 7. Issue book to students   
				System.out.println("No data.!");
				break;

			case 8: // 8. Show Stock after book issue
				System.out.println("No data.!");
				break;

			case 9: // 9. View student wise books
				System.out.println("No data.!");
				break;

			case 10: // 10. Delete book by author
				System.out.println("No data.!");
				break;
			default:
				System.out.println("Wrong choise");
			}
		} while (true);

	}

}
