package Mediator.DesignPattern;

public class StockOffer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int collegueCode = 0;

	public StockOffer(int numberOfShares, String stock, int collCode) {
		
		stockShares = numberOfShares;
		stockSymbol = stock;
		collegueCode = collCode;
	}
	
	public int getStockShares(){ return stockShares;}
	public String getStockSymbol(){ return stockSymbol;}
	public int getCollCode(){ return collegueCode;}

}
