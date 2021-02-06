
public class TurnOvenOff implements Command {
	
	ElectricStove theStove;
	
	public TurnOvenOff(ElectricStove newStove) {
		
		theStove = newStove;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theStove.off();
		
	}


}
