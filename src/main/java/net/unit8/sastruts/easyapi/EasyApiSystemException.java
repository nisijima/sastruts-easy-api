package net.unit8.sastruts.easyapi;


@SuppressWarnings("serial")
public class EasyApiSystemException extends RuntimeException {

	public EasyApiSystemException(String message) {
		super(message);
	}

	public EasyApiSystemException(String message, Exception cause) {
		super(message, cause);
	}

}
