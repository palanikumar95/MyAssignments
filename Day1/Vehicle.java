package week1.Day1;

public class Vehicle {

	public void car() {
		System.out.println("Honda");
	}

	public void fireFighter() {
		System.out.println("jet");
	}

	public void bus() {
		System.out.println("passengers");
	}


public static void main(String[] args) {
	Vehicle veh=new Vehicle();//classname objectname= new classname
	//object
	veh.bus();
	veh.car();
	veh.fireFighter();
	
}

}
