package E_library_management_System;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    static int count=100;
    private List<LibraryItem> borrowedItems=new ArrayList<LibraryItem>();
	public User(String userId, String name) {
		this.userId = userId;
		this.name = name;
		userId="user@"+ count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public List<LibraryItem> getBorrowedItems() {
		return borrowedItems;
	}
    public void addBorrowItem(LibraryItem item) {
    	borrowedItems.add(item);
    	System.out.println("Item is added succesfully");
    }
    public void removeBorrowItem(LibraryItem item) {
    	borrowedItems.remove(item);
    	System.out.println("Item is removed succesfully");
    }
}
