
public class Oven implements ElectricStove {
	
	private int temp = 350;

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Oven is on");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Oven is off");
		
	}

	@Override
	public void tempUp() {
		// TODO Auto-generated method stub
		System.out.println("Oven Temperature is " + temp);
		
	}

	@Override
	public void tempDown() {
		// TODO Auto-generated method stub
		System.out.println("Oven Temperature is " + temp);
		
	}

}
