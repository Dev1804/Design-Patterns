package Adapter.DesignPattern;

// This is the Target Interface: This is what the client exepcts to work with.
//
public interface EnemyAttacker {

	public void fireWeapon();
	public void driveForward();
	public void assignDriver(String driveName);
}
