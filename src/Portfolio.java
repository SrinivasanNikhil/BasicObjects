
/**
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

		/**
		 * Declare 2 new stocks for facebook and linkedin name: Facebook, number
		 * owned:300, price: 75 name: Linked In, number owned: 500, price: 100
		 * 
		 * Print out information about the complete portfolio, i.e. the information
		 * about all the stocks owned
		 * 
		 * Calculate and print out the value of the entire portfolio i.e sum up the
		 * value of each of the stocks owned in the portfolio
		 */

		Stock fb = new Stock("Facebook", 300, 75.0);
		Stock lnkd = new Stock("Linked In", 500, 100.0);

	}

}
