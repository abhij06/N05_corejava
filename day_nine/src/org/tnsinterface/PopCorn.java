package org.tnsinterface;
/* Functional interface
 * An interface which contains an exactly one abstract method
 * then that interface is known as functional interface*/

/* below ensures that we have to use exactly one abstract method inside interface*/
@FunctionalInterface
public interface PopCorn
{
	void displayReceipe();
}
