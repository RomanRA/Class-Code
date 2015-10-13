package MyException;

public class DuplicateEntryException extends Exception {

	public DuplicateEntryException(String message){
		System.out.println(message);
	}
}
