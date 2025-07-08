package E_library_management_System;

public class BorrowingTask implements Runnable {
    private Library library;
    private User user;
    private String itemTitle;

    public BorrowingTask(Library library, User user, String itemTitle) {
        this.library = library;
        this.user = user;
        this.itemTitle = itemTitle;
    }

    public void run() {
        try {
            synchronized (library) {
                if (user.getBorrowedItems().size() >= 5)
                    throw new MaxBorrowLimitExceededException("Borrow limit exceeded.");

                LibraryItem item = library.searchItem(itemTitle);

                if (!item.isAvailable())
                    throw new ItemNotAvailableException("Item already borrowed.");

                item.setAvailable(false);
                item.borrowItem();
                user.addBorrowedItem(item);
                System.out.println(user.getName() + " successfully borrowed: " + itemTitle);
            }
        } catch (Exception e) {
            System.out.println(user.getName() + " -> Error: " + e.getMessage());
        }
    }
}

