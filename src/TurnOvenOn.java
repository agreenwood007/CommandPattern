
public class TurnOvenOn implements Command {
	
	ElectricStove theStove;
	
	public TurnOvenOn(ElectricStove newStove) {
		
		theStove = newStove;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theStove.on();
		
	}

}
