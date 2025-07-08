package E_library_management_System;

public abstract class LibraryOperations {
	public abstract LibraryItem searchItem(String title);
	public abstract void returnItme(LibraryItem item,User user);
	public abstract void addItem(LibraryItem item);
}
