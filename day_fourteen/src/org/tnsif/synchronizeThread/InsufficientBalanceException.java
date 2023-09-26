package org.tnsif.synchronizeThread;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Minumum balance in your account...");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}