package override;

public class bike extends vehicle {
	public bike(String numberPlate) {
		super(numberPlate);
	}

	
	public void move() {
		System.out.println("bike moves");
	}

}
