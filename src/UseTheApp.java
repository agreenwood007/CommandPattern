
public class UseTheApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricStove newStove = StoveApp.getStove();
		
		TurnOvenOn onCommand = new TurnOvenOn(newStove);
		
		StoveReset onPressed = new StoveReset(onCommand);
		
		onPressed.press();
		
		
		TurnOvenOff offCommand = new TurnOvenOff(newStove);
		
		onPressed = new StoveReset(offCommand);
		
		onPressed.press();

		
		ChangeOvenTemp tempUpCommand = new ChangeOvenTemp(newStove);
		
		onPressed = new StoveReset(tempUpCommand);
		onPressed.press();
	}

}
