package Facade.DesignPatterm;

public class AccountNumberCheck {

	private int accountNumber=12345678;
	
	public int getAccountNumer(){ return accountNumber;}
	
	public boolean accountActive(int acctNumToCheck){
		
		if(acctNumToCheck==acctNumToCheck){
			return true;
		}else{
			return false;
		}
	}
}
