package com.upskill.java_5;

public abstract class AbstractClass {
	
	public static void main(String[] args){}
	
	
//Regular method 
	public void car(){
		System.out.println("My car is Audi! ");
		
	}
	//Abstract method doesn't have any implementation
	public abstract void iDoor();


//Regular returntype method - integer
	public int truck() {
	return 5;

	
	}
	//Abstract returntype method - integer
	public abstract int iTruck();
	
	
	//Regular returntype method - String
	public String bus(){
		return "Greyhound";
	}
	//Abstract  returntype method - String
	public abstract String iBus();
		
}





	
	
