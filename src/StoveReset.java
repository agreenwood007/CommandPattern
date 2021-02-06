
public class StoveReset {
	
	Command theCommand;
	
	public StoveReset(Command newCommand) {
		
		theCommand = newCommand;
		
	}
	
	public void press() {
		
		theCommand.execute();
	}

}
