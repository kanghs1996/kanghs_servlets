package org.kanghs.ch11.dao;

/**
 * SQLException을 wrapping하기 위한 RuntimeException.<br>
 * RuntimeException의 constructor들을 override 한다.
 * 
 * @author kanghs
 */
public class DaoException extends RuntimeException {

	public DaoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DaoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DaoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
