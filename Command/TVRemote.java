package Command.DesingPattern;


public class TVRemote {

	public static ElectronicDevice getDevice(){
		return new Television();
	}
}
