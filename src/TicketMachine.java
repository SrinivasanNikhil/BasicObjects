public class TicketMachine {

	int price;
	/**
	 * Have students add a destination
	 */
	String destination;
	int collections;
	
	public TicketMachine()
	{
		price = 10;
		destination = "PeachTree";
		collections = 0;
	}
	
	/**
	 * Have students build a constructor that takes both cost and destination
	 */
	public TicketMachine(int cost, String aDestination)
	{
		price = cost;
		destination = aDestination;
		
	}
	
	
	public void printTicket() {
		System.out.println("***************************");
		System.out.println("******* MARTA Ticket ******");
		System.out.println("**** Ticket price: " + price +" *****");
		System.out.println("******** Red Line *********");
		System.out.println("****** To " + destination + "*******");
		System.out.println("***************************");
		
		collections = collections + price;
	}
	
	public void printCollections()
	{
		System.out.println("Money collected : " + collections);
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
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String dest) {
		destination = dest;
	}
	
	
	
	

}
