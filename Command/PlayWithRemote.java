package Command.DesingPattern;
import java.util.*;


public class PlayWithRemote {


	public static void main(String[] args) {
		//Gets the ElectronicDevice TO USE 
		ElectronicDevice newDevice=TVRemote.getDevice();
		
		

		// TurnTVOn contains the command to turn on the tv
		// When execute() is called on this command object
		// it will execute the method on() in Television
		
		TurnTVOn onCommand=new TurnTVOn(newDevice);
		// Calling the execute() causes on() to execute in Television
		
		DeviceButton button=new DeviceButton(onCommand);
		
		// When press() is called theCommand.execute(); executes
		button.press();
		
	//----------------------------------------------------------
		
		// Now when execute() is called off() of Television executes
		TurnTVOff offCommand=new TurnTVOff(newDevice);
		button=new DeviceButton(offCommand);
		button.press();
		
		// Now when execute() is called volumeUp() of Television executes
		
		TurnTVUp upCommand=new TurnTVUp(newDevice);
		button=new DeviceButton(upCommand);
		button.press();
		button.press();
		button.press();
		
		//----------------------------------------------------------
		

		// Creating a TV and Radio to turn off with 1 press
		
		Television theTV=new Television();
		Radio theRadion=new Radio();
		
		// Add ElectronicDevices to a List
		
		List<ElectronicDevice> allDevices=new ArrayList<ElectronicDevice>();
		allDevices.add(theRadion);
		allDevices.add(theTV);
		
		 TurnItAllOff turnAllOff=new TurnItAllOff(allDevices);
		 button=new DeviceButton(turnAllOff);
		 button.press();
		 
		 button.pressUndo();
		 
		 LinkedList<Command> list=new LinkedList<Command>();
		 list.addFirst(upCommand);
		 list.addFirst(offCommand);
		 list.addFirst(onCommand);
		 list.addFirst(turnAllOff);
		 
		 System.out.println("**** I suppose that's the aproppiate way to solve this task! ****");
		 for(Command command:list){
			 DeviceButton pressButton=new DeviceButton(command);
		 pressButton.press();
		 }
		 
		 
		
		
		
		
	}

}
