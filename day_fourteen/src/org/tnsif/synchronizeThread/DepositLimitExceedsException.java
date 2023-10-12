package org.tnsif.synchronizeThread;

@SuppressWarnings("serial")
public class DepositLimitExceedsException extends Exception 
{
	public DepositLimitExceedsException() 
	{
		super("Deposit limit exceeded.....");
	}

	public DepositLimitExceedsException(String message) 
	{
		super(message);
	}
}
