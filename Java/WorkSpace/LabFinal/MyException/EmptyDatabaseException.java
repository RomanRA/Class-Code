package MyException;

public class EmptyDatabaseException extends Exception {
	public EmptyDatabaseException(String message){
		System.out.println(message);
	}
}
