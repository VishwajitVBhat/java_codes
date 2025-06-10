package library_management_system;

public class Book {
 String title;
 String author;
 String ISBN;
 static int count=1000;
     Book(String title,String author){
	 this.title=title;
	 this.author=author;
	 this.ISBN= "ISBN"+count++;
 }
     void displayDetails() {
    	 System.out.println("===Book Details===");
    	 System.out.println("the book title: "+title);
    	 System.out.println("the book author: "+author);
    	 System.out.println("the book ISBN: "+ISBN);
     }

}
//class Fiction extends Book{
//	String genre;
//}
//class NonFiction extends Book{
//	String subject;
//}
