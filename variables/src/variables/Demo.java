package variables;

class Car{  //class
	String color; //instant variable 
	
	static String brand = "Mercedes"; //static use for all object
	void speed() {
		int speed = 10; // local
			System.out.println("The Brand of Cars is: "+ brand+ " and the color is: "+ color+ " with the speed limit is: "+ speed+ "MPH");
	}
}

public class Demo {

	public static void main(String[] args) {   //main method
		Car c1 = new Car(); //object
		c1.color = "Yellow";
		Car c2 = new Car();
		c2.color = "Red";
		
		c1.speed();
		c2.speed();
	}
}
