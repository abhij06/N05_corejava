package org.tnsinterface;

public interface DebitCard 
{
	/* by default all the variables an interface is public 
	 * static final and if it final them we must have to initialize
	 * value of variable */
	long cardno=347554997979L;
	//we can't use concrete method inside an interface
	void displayCardDetails();
	//default method and static method is new feature of java
	default void display()
	{
		System.out.println("Default Method");
	}
	//static method 
	static void print()
	{
		System.out.println("Static method");
	}
}

