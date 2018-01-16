
public class TicketPrinter {

	
	/*
	 *Objects > attributes/fields, actions/methods, methods can be public or accessible to other objects
	 *giveMeSSN() is not a method you would have
	 *You don't need to know the logic of methods as long as you can use them and know their input and output
	 *think of a microwave, you don't need to know its internal operations to use it
	 *
	 * Class defined the object, like template, blueprint, it has a definition or a specific structure
	 * 
	 * variables can be declared and initialized in the same line
	 * = is assignment and assigns the variable a value
	 * 
	 * Variables can change, but change systematically based on what was in them previously!
	 * LHS gets the sum of collections and price, its the old value in collections, which was 0 and 
	 * price which was 10
	 * 
	 * names for variables can't be reserved words, like public, private...etc...
	 * Java supports basic arithmetic operations, PEDMAS
	 * 
	 * Line comment and block comment
	 * 
	 * Calling methods, methods can only be called on objects that they belong to. methods are public or private, 
	 * public methods can be called by other objects to get an object to do something
	 * 
	 * methods tend to be public, some methods take information/data called parameters or arguments
	 * to the method, sometimes methods make take more than one piece of information
	 * 
	 *  Methods can sometimes return information as well, a method can only return
	 *  a single value or no value (void). It is part of method declaration.
	 *  
	 *  How are objects made? what makes the object and sets it up? the constructor
	 *  constructor is what is involved when new is used, constructor is like a special method
	 *  objects stored in a variable/reference variable. 
	 *  
	 *  
	 *  
	 *  
	 * 
	 * 
	 *
	 */
	public static void main(String[] args) {
	
		int price = 10;
		int collections = 0;
		int nosPrinted = 0;
		

		TicketMachine tm = new TicketMachine(); //new keyword allows for an object to be made of a specific type
		tm.printTicket();
		
		collections = collections + price;
		

	}

}
