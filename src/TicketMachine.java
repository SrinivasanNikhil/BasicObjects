
public class TicketMachine {

	int nosPrinted;
	
	public void printTicket() {
		System.out.println("***************************");
		System.out.println("******* MARTA Ticket ******");
		System.out.println("**** Ticket price: 10 *****");
		System.out.println("******** Red Line *********");
		System.out.println("***************** *********");
		nosPrinted = nosPrinted +1;
	}
	
	public void printNosSold()
	{
		System.out.println("The number of tickets printed : " + nosPrinted);
		
	}

}
