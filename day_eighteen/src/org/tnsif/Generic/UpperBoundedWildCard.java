package org.tnsif.Generic;

//Program to demonstrate upper bound wild card class



import java.util.List;

public class UpperBoundedWildCard {
	//Parameter ArrayList(<?>) is List of any subclass object of Number
	public static Double sumOfList(List<? extends Number> al) // any subclass of Number class
	{
		double sum = 0.0;
		for (Number n : al) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}

}

