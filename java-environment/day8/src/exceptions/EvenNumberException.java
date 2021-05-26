package exceptions;

/*
 * EvenNumberException is a custom exception class that is
 * created to communicate to users of our system that we
 * do not want to accept Even Numbers in certain scenarios...
 */
public class EvenNumberException extends Exception {
	/*
	 * The constructor below will pass a message, which we can
	 * create, to the superclass (i.e. Exception class) when
	 * we create/throw our EvenNumberExceptions
	 */
	public EvenNumberException(String message) {
		super(message);
	}
}
