package Template.DesignPattern;

public abstract class Hoagie {

	boolean afterFirstCondiment=false;
	// Template method
	final void makeSandwich() {
		cutBun();

		if (customerWantsMeat()) {

			addMeat();
			afterFirstCondiment=true;
		}
		if (customerWantsCheese()) {

			if(afterFirstCondiment){System.out.print("\n");}
			addCheese();
			afterFirstCondiment=true;
		}
		if (customerWantsVegetables()) {
			
			if(afterFirstCondiment){System.out.print("\n");}
			addVegetables();
			afterFirstCondiment=true;
		}
		if (customerWantsCondiments()) {
			
			if(afterFirstCondiment){System.out.print("\n");}
			addCondiments();
			afterFirstCondiment=true;
		}
		wrapTheHoagie();
		
	}
	public void cutBun(){
		System.out.println("The Hoagie is Cut");
	}

	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();

	boolean customerWantsMeat() {return true;}
	boolean customerWantsCheese() {return true;}
	boolean customerWantsVegetables(){return true;}
	boolean customerWantsCondiments(){	return true;}
	
	public void wrapTheHoagie(){
		System.out.println("\nWrap the Hoagie ");
	}
	public void afterFirstCondiment(){
		System.out.println("\n");
	}
	
}
