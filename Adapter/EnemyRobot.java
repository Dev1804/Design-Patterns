package Adapter.DesignPattern;
import java.util.*;

public class EnemyRobot {

	Random rand=new Random();
	
	public void smashWithHands(){
		int attackDamage=rand.nextInt(10)+1;
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
	}
	
	public void walkForward(){
		int movement=rand.nextInt(5)+1;
		System.out.println("Enemy Robot walks Forward "+movement+ "spaces");
	}
	public void reactToHuman(String driverName){
		System.out.println("Enemy Robot Tramps on "+driverName);
	}
}
