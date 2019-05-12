package Proxy.DesignPattern;

public class TestATMMachine {

	public static void main(String[] args) {
		ATMMachine1 atmMachine=new ATMMachine1();
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		
		// Proxy Design pattern
		
		GetATMData realATMMachine=new ATMMachine1();
		GetATMData atmProxy=new ATMProxy();
		
		System.out.println("\n Current ATM State " + atmProxy.getADMData());
		System.out.println("\n Cash in ATM State $" + atmProxy.getCashInMachine());
		
		
		
		
		
		
	}
}