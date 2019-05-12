package Command.DesingPattern;
//This is known as the invoker
//It has a method press() that when executed
//causes the execute method to be called

//The execute method for the Command interface then calls 
//the method assigned in the class that implements the
//Command interface
public class DeviceButton {

	Command theCommand;
	
	public DeviceButton(Command newCommand){
		theCommand=newCommand;
	}
	
	void press(){
		theCommand.execute();
	}
	
	void pressUndo(){
		theCommand.undo();
	}
	
	
}
