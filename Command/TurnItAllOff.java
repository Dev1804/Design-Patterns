package Command.DesingPattern;
import java.util.*;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> theDevices){
		this.theDevices=theDevices;
		
	}
	
	
	@Override
	public void execute() {
		
		for(ElectronicDevice devices:theDevices)
			devices.off();

	}

	@Override
	public void undo() {
		for(ElectronicDevice devices:theDevices)
			devices.on();
		
	}

	
}
