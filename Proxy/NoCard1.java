package Proxy.DesignPattern;



public class NoCard1 implements ATMState1 {

	ATMMachine1 atmMachine;
	
	public NoCard1(ATMMachine1 newAtmMachine){
		atmMachine=newAtmMachine;
	}
	
	@Override
	public void insertCard() {
		
		System.out.println("Please Enter a PIN");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	@Override
	public void ejectCard() {
		
		System.out.println("Enter a card first");
	
	}

	@Override
	public void insertPin(int pinEntered) {
		
		System.out.println("Enter a card first");
		
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		

		System.out.println("Enter a card first");
	}

	
}
