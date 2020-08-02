package override;

public class UI {
	public static void main(String args[]) {
	
		vehicle vehicle=new car();
		vehicle.move();

	}
	vehicle car=new Car("c11");
	car.move();
	String carNumber=car.getNumberPlate();
	System.out.println("car number="+carNumber);

	vehicle bike=new bike("b11");
	bike.move();
	String bikeNumber=bike.getNumberPlate();
	System.out.println("bike number="+bikeNumber);


}
