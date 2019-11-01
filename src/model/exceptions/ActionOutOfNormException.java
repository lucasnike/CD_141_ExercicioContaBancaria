package model.exceptions;

public class ActionOutOfNormException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ActionOutOfNormException(String msg) {
		super(msg);
	}
}
