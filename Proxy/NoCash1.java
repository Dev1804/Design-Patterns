package Proxy.DesignPattern;

public class NoCash1 implements ATMState1 {

ATMMachine1 atmMachine;
	
	public NoCash1(ATMMachine1 newAtmMachine){
		atmMachine=newAtmMachine;
	}

	@Override
	public void insertCard() {
		
		System.out.println("We don't have money");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("We don't have money,You didn't enter a card");
		
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("We don't have money");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("We don't have money");
		
	}
}
