package lab03;

public class PreconditionException extends RuntimeException {

	private static final long serialVersionUID = -3777241915362988836L;
	
	public PreconditionException() {
		super();
	}

	public PreconditionException(String message) {
		super(message);
	}
}
