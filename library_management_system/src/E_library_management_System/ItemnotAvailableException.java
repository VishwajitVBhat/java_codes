package E_library_management_System;

public class ItemnotAvailableException extends Exception {
	public ItemnotAvailableException(String message) {
		super(message);
	}
}
class ItemNotfoundException extends Exception{
	public ItemNotfoundException(String message) {
		super(message);
	}
}
class MaxBorrowLimitExceededException extends Exception{
	public MaxBorrowLimitExceededException(String message) {
		super(message);
	}
}