package Bridge.DesignPattern;

public class DVDDevice extends EntertainmentDevice{

	
	public DVDDevice(int newstateDevice,int newMaxSetting){
		
		super.deviceState=newstateDevice;
		super.maxSetting=newMaxSetting;
	}
	@Override
	public void buttonFivePressed() {
	System.out.println("DVD Skips to Last Chapter");
	deviceState--;
		
	}

	@Override
	public void buttonSixPressed() {
		
		System.out.println("DVD Skips to Next Chapter");
		deviceState++;
	}

	
}
