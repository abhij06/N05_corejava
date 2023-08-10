package org.tnsif.UserDefinedException;

public class LoginCredintial extends Exception
{
	private String str;

	
	//getter setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString()
	{
		return "LoginCredentials [str="+str+"]";
	}

	public LoginCredintial(String str) {
		super();
		this.str = str;
	}
}
