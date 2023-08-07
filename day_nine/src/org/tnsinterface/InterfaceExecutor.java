package org.tnsinterface;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SBIDebitCard s=new SBIDebitCard();
		s.displayCardDetails();
		//we can call default method of an interface using the obj class
		s.display();
		/* print is static method inside an interface 
		 * to call print() method we have to use interface method 
		 * name();*/
		DebitCard.print();
		
		//CheesePopCorn c=new CheesePopCorn();
		//c.displayReceipe();
		
		Person p=new Person();
		p.showDrinkName();
		
		
	}

}
