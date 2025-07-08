package E_library_management_System;

public class Main {
    public static void main(String[] args) {
    	Library library = new Library();
    	
    	library.addItem(new Book("B1", "Java Basics", "John Doe", "Programming"));
        library.addItem(new Book("B2", "Data Structures", "Alice", "CS"));
        library.addItem(new Journal("J1", "Tech Today", "IEEE", 12));


    	 User u1 = new User("U1", "Vishwajit");
         User u2 = new User("U2", "Sumanth");

         // Multithreaded borrowing
         Thread t1 = new Thread(new BorrowingTask(library, u1, "Java Basics"));
         Thread t2 = new Thread(new BorrowingTask(library, u2, "Java Basics"));
         Thread t3 = new Thread(new BorrowingTask(library, u1, "Tech Today"));

         t1.start(); t2.start(); t3.start();

         // Join threads to wait for execution
         try { t1.join(); t2.join(); t3.join(); } catch (InterruptedException e) {}

         // Display all items
         System.out.println("\n--- Final Library Inventory ---");
         library.displayAllItemsSorted();
     }
 }
