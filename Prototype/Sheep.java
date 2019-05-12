package Prototype.DesignPattern;

public class Sheep implements Animal{

	public Sheep(){
		System.out.println("Sheep is made");
	}
	
	@Override
	public Animal makeCopy() {
		
		System.out.println("Sheep is Being Made");
		Sheep sheepObject=null;
		
		try {
			sheepObject=(Sheep)super.clone();
			
			// If Animal didn't extend Cloneable this error 
			// is thrown
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString(){
		return "Dolly is my Hero, Baaaa";
	}

}
