package warmup;



public class CarAction {

public static void main(String[] args) {
	 
Car j= new Car();
j.model="BMW";
j.currentSpeed=55;
j.color="Black";

j. printCarInformation();

j.accelarate(40);
j. printCarInformation();
 int totalSpeed=j.getCurrentSpeed();
 System.out.println("Speed after accelaration is : "+totalSpeed);



	}

}
