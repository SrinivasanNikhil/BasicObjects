
public class TicketMachine {

	int price;
	/**
	 * Have students add a destination
	 */
	
	public TicketMachine()
	{
		
	}
	
	public TicketMachine(int cost)
	{
		price = cost;
		
	}
	
	/**
	 * Have students build a constructor that takes both cost and destination
	 */
	
	
	public void printTicket() {
		System.out.println("***************************");
		System.out.println("******* MARTA Ticket ******");
		System.out.println("**** Ticket price: 10 *****");
		System.out.println("******** Red Line *********");
		System.out.println("***************************");
	}
	
	public void setPrice(int cost)
	{
		price = cost;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	/**
	 * Students build this getter and setter methods for destination
	 */
	
	

}
