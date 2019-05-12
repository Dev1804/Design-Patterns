package Proxy.DesignPattern;


public class ATMMachine1 implements GetATMData {

	ATMState1 hasCard;
	ATMState1 noCard;
	ATMState1 hasCorrectPin;
	ATMState1 atmOutOfMoney;
	
	ATMState1 atmState;
	
	int cashInMachine=2000;
	boolean correctPinEntered=false;
	
	public ATMMachine1(){
		
		hasCard=new HasCard1(this);
		noCard=new NoCard1(this);
		hasCorrectPin=new HasPin1(this);
		atmOutOfMoney=new NoCash1(this);
		
		atmState=noCard;
		if(cashInMachine<0){
			atmState=atmOutOfMoney;
		}
	}
	
	void setATMState(ATMState1 newATMState){
		atmState=newATMState;
	}
	
	public void setCashInMachine(int newCashInMachine){
		cashInMachine=newCashInMachine;
	}
	public void insertCard(){
		atmState.insertCard();
	}
	public void ejectCard(){
		atmState.ejectCard();
	}
	public void requestCash(int cashToWithdraw){
		atmState.requestCash(cashToWithdraw);
	}
	public void insertPin(int pinEntered){
		atmState.insertPin(pinEntered);
	}
	
	public ATMState1 getYesCardState(){return hasCard;}
	public ATMState1 getNoCardState(){return noCard;}
	public ATMState1 getHasPin(){return hasCorrectPin;}
	public ATMState1 getNoStateCashState(){return atmOutOfMoney;}

	@Override
	public ATMState1 getADMData() {
		
		
		return atmState;
	}

	@Override
	public int getCashInMachine() {
	
		return cashInMachine;
	}

}
