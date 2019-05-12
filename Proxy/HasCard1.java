package Proxy.DesignPattern;

import State.DesignPattern.ATMMachine;

public class HasCard1 implements ATMState1 {


	ATMMachine1 atmMachine;
	
	public  HasCard1(ATMMachine1 newATMMachine){
		atmMachine=newATMMachine;
	}
	
	
	@Override
	public void insertCard() {
		
		System.out.println("You can't enter more than one card");
		
	}

	@Override
	public void ejectCard() {
		
		System.out.println("Card ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
		
	}

	@Override
	public void insertPin(int pinEntered) {
		
		if(pinEntered==1234){
			System.out.println("Correct PIN");
			atmMachine.correctPinEntered=true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else{
			System.out.println("Wrong PIN");
			atmMachine.correctPinEntered=false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		
		System.out.println("Enter PIN First");
		
	}
}
