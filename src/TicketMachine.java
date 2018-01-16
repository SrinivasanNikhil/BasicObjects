
public class TicketMachine {

	
	
	public TicketMachine()
	{
		
	}
	
	public TicketMachine(String name)
	{
		System.out.println("Ticket for " + name);
		printTicket();
	
	}
	
	public void printTicket() {
		System.out.println("***************************");
		System.out.println("******* MARTA Ticket ******");
		System.out.println("**** Ticket price: 10 *****");
		System.out.println("******** Red Line *********");
		System.out.println("***************************");
	}
	

}
