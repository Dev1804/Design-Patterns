package Proxy.DesignPattern;

public interface ATMState1 {

	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);
	
	
}
