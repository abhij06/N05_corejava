package org.tnsif.synchronizeThread;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Minumum balance in your account...");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}