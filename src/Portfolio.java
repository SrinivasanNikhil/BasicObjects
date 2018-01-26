
/**
 * Assignment 2
 * 
 * You have been provided with 2 classes Stock and Portfolio.
 * 
 * The Stock class describes the template for stocks. Stocks have 3 fields/properties String stockName, int numberOfShares, double priceOfShare
 * The constructor of Stock takes 3 parameters corresponding to the fields/properties of the Stock class.
 * There are a variety of accessor/getter methods and mutator/setter methods for Stock.
 * 
 * The Portfolio class does not have any fields/properties and has a main method. 
 * Within the main method of Portfolio, a double variable portfolioValue is declared and set to 0.0.
 * There are also 4 Stock objects made corresponding to 4 companies.
 * 
 * Your Tasks:
 * a. Create a new Java project
 * b. Import the 2 provided class files into the project or copy and paste the code. You may also go to ELC and download the zip archive of the 
 * starter project provided into your eclipse environment.
 * c. Work within the Stock class and accomplish the following
 * 		
 * 		c.1 Create a method 
 * 				public double calculateStockValue() {
 * 
 * 						}
 * 		Work in this method and calculate the value of the Stock (numberOfShares * priceOfShare) and return it.
 * 
 *  		c.2 Create a method 
 *  				public void printInfo() {
 *  
 *  						}
 *  		Work in this method to print out information of the Stock including stockName, numberOfShares and priceofShare.
 *  		Employ the provided  out as a guide to how the result of this method should look.
 *  
 *  d. Work within the main method of the Portfolio class after the existing code and accomplish the following
 *  
 *  		d.1  Declare and initialize 2 new Stock objects for 
 *  			facebook and linkedin respectively with the following parameters
 *  			stockName: Facebook numberOfShares:300, priceOfShare: 75
 *  			stockName: Linked In numberOfShares:500, priceOfShare: 100
 * 
 * 		d.2	Print out information about the complete portfolio, i.e. the information
 * 			about all the stocks owned in the following order Amazon, Apple, Facebook, GE, GM and LinkedIn
 * 
 * 		d.3	Calculate and print out the value of the entire portfolio i.e sum up the
 * 			value of each of the stocks owned in the portfolio.
 *  		
 * 
 * 
 * 
 * 
 * 
 * @author nikhilsrinivasan
 *
 */
public class Portfolio {

	public static void main(String[] args) {

		double portfolioValue = 0.0;

		Stock appl = new Stock("Apple", 1000, 50.0);
		Stock ge = new Stock("General Electric", 1001, 51.0);
		Stock gm = new Stock("General Motors", 2001, 25.0);
		Stock amzn = new Stock("Amazon", 10000, 500.0);

		/*
		 * CODE HERE 
		 */

		Stock fb = new Stock("Facebook", 300, 75.0);
		Stock lnkd = new Stock("Linked In", 500, 100.0);

		System.out.println("Current Portfolio of Stocks :");
		System.out.println();
		amzn.printInfo();
		System.out.println();
		appl.printInfo();
		System.out.println();
		fb.printInfo();
		System.out.println();
		ge.printInfo();
		System.out.println();
		gm.printInfo();
		System.out.println();
		lnkd.printInfo();
		System.out.println();

		double totalPortfolioValue;

		totalPortfolioValue = amzn.calculateStockValue() + appl.calculateStockValue() + fb.calculateStockValue()
				+ ge.calculateStockValue() + gm.calculateStockValue() + lnkd.calculateStockValue();

		System.out.println("Total portfolio value : " + totalPortfolioValue + " dollars.");

	}

}
