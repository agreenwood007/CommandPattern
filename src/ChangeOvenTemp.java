
public class ChangeOvenTemp implements Command {
	
	ElectricStove theStove;
	
	public ChangeOvenTemp(ElectricStove newStove) {
		
		theStove = newStove;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		theStove.tempUp();
		
	}
	
}
