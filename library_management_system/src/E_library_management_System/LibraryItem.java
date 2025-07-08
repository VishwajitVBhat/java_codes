package E_library_management_System;

public class LibraryItem {
	String itemId;
	String title;
	boolean availability =true;	
	public LibraryItem(String itemId, String title) {
		this.itemId = itemId;
		this.title = title;
	}
	void displayDetails() {
		System.out.println("Id:"+itemId+"Title:"+title+"Availability:"+(availability ? "Yes" :"NO"));
	}
	public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean status) {
        this.availability = status;
    }
	void borrowItem() {
		System.out.println("Item:"+title+" is borrowed succefully");
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
}


class Book extends LibraryItem{
	String author;
	String genre;
	public Book(String itemId, String title,String author, String genre) {
		super(itemId,title);
		this.author = author;
		this.genre = genre;
	}
	@ Override
	void displayDetails() {
		System.out.println("Id:"+itemId+"Title:"+title+"Availability:"+(availability ? "Yes" :"NO")+"Author:"+author+"Genre:"+genre);
	}
	@ Override
	void borrowItem() {
		System.out.println("Book:"+title+" is borrowed succefully");	
		}
}


class Journal extends LibraryItem{
	String publisher;
	int issueNumber;
	public Journal(String itemId, String title,String publisher, int issueNumber) {
		super(itemId,title);
		this.publisher = publisher;
		this.issueNumber = issueNumber;
	}
	@ Override
	void displayDetails() {
		System.out.println("Id:"+itemId+"Title:"+title+"Availability:"+(availability ? "Yes" :"NO")+"Publisher:"+publisher+"IssueNumber:"+issueNumber);
	}
	@Override
	void borrowItem() {
		System.out.println("Journal:"+title+" is borrowed succefully");	
		}
}
