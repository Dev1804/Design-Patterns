package Adapter.DesignPattern;
import java.util.*;

public class EnemyTank implements EnemyAttacker {

	Random rand=new Random();
	
	@Override
	public void fireWeapon() {
	
		int attackDamage=rand.nextInt(10)+1;
		System.out.println("Enemy Tank Does "+attackDamage+" Damage");
	}

	@Override
	public void driveForward() {
		
		int movement=rand.nextInt(5)+1;
		System.out.println("Enemy Tank moves "+movement+ "spaces");
		
	}

	@Override
	public void assignDriver(String driveName) {
		System.out.println(driveName + " is driving the tank");
		
	}
	

}
