package Proxy.DesignPattern;

public class ATMProxy implements GetATMData{

	@Override
	public ATMState1 getADMData() {
		
		ATMMachine1 realATMMachine=new ATMMachine1();
		
		return realATMMachine.getADMData();
	}

	@Override
	public int getCashInMachine() {
		
		ATMMachine1 realATMMachine=new ATMMachine1();
		
		return realATMMachine.getCashInMachine();
	}

	
}
