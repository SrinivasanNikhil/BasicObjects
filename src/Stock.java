
public class Stock {
	
	String stockName;
	int numberOfShares;
	double priceOfShare;
	
	public Stock(String name, int shares, double price)
	{
		stockName = name;
		numberOfShares = shares;
		priceOfShare = price;
	}

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return the numberOfShares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}

	/**
	 * @param numberOfShares the numberOfShares to set
	 */
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	/**
	 * @return the priceOfShare
	 */
	public double getPriceOfShare() {
		return priceOfShare;
	}

	/**
	 * @param priceOfShare the priceOfShare to set
	 */
	public void setPriceOfShare(double priceOfShare) {
		this.priceOfShare = priceOfShare;
	}
	
	
	

}
