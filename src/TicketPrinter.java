
public class TicketPrinter {

	public static void main(String[] args) {
	
		//int collections = 0; //move to TicketMachine since it can keep track of tickets sold
		//int price = 10;// move this to TicketMachine as it should know the price of a ticket
		
		
		TicketMachine tm1;
		tm1 = new TicketMachine(100,"New York");
		
		tm1.printTicket();
		tm1.printTicket();
		tm1.printTicket();
		tm1.printCollections();
		
		
		tm1.setPrice(50);
		tm1.setDestination("Sandy Springs");
		
		System.out.println("The cost to travel to " + tm1.getDestination() + " is " + tm1.getPrice() );
		
		tm1.printTicket();
		tm1.printCollections();
		
		TicketMachine tm2 = new TicketMachine(200,"San Francisco");
		tm2.printTicket();
		tm2.printCollections();
		
		
	}

}
