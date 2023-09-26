package org.tnsif.synchronizeThread;

public class AccountThread extends Thread {
	Account acc;
	int amount;

	public AccountThread() {

	}

	public AccountThread(Account acc, int amount) {
		this.acc = acc;
		this.amount = amount;
	}

	public void run() {
		try {
			synchronized (acc) {
				acc.withdraw(amount);
			}
			
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}