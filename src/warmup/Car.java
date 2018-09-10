package warmup;

public class Car {
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInformation(){
		
		System.out.println(color + " " +model+" is driving " + currentSpeed + " MpH");
	}
		
public void accelarate(int moreSpeed){
	
	currentSpeed=currentSpeed+moreSpeed;
}
	public int getCurrentSpeed(){
		return currentSpeed;
		
	}
	
	
	//int newSpeed=currentSpeed+moreSpeed;
	//currentSpeed=newSpeed;
}

