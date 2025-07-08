package E_library_management_System;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Library extends LibraryOperations {
	private Map<String, LibraryItem> inventory = Collections.synchronizedMap(new HashMap<>());

    public void addItem(LibraryItem item) {
        inventory.put(item.itemId, item);
    }
    public synchronized LibraryItem searchItem(String title) throws ItemNotFoundException {
    	for(LibraryItem in:inventory) {
    	if(in.(in.title)) {
    		 
    	 }
    	}
    }

    public synchronized void returnItem(LibraryItem item, User user) {
        item.setAvailable(true);
        user.removeBorrowItem(item);
        System.out.println("Item returned: " + item.getTitle());
    }

    public void displayAllItemsSorted() {
        inventory.values().stream()
                .sorted(Comparator.comparing(LibraryItem::getTitle))
                .forEach(LibraryItem::displayDetails);
    }

    public Map<String, LibraryItem> getInventory() {
        return inventory;
    }
}
