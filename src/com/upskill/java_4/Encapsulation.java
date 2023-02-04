package com.upskill.java_4;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method 
	//Encapsulation is a way to restrict the direct access to some components of an object,
	//so users cannot access state values for all of the variables of a particular object. 
	//Encapsulation can be used to hide both data members and data functions,
	//or methods associated with an instantiated class or object.
	
	private String name = "Upskill";    //write & read
	private int ssn = 123456789;        //write only
	private String username = "Masud Zaman";    //read only
	private int age = 24;              // write and read only
	private String city = "Jamaica";   // write and read only 

	public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setName("Masud");
	System.out.println(obj.getName());             
	obj.setSSN(123456789);
	System.out.println(obj.getusername());
	System.out.println(obj.getAge());
	obj.setCity("Jamaica");
	System.out.println(obj.getCity());
    	}
	
	

	//Setter method - name     //set the data, write
	public void setName(String value){
		name = value;
		
	}
	
	//Getter method - name      // get the data, read
	public String getName(){
		return name;
	}
	
		
	// Setter method is void method -- needs object
	// Getter method uses return-type method -- doesn't need object
	
	//Setter method - ssn       //set the data, write
	public void setSSN (int value){
		ssn = value;
		
	}
	
	//Setter method - username                    // get the data, Read
	public String getusername(){
		return username;
	
		
	}

	// Do setter and getter method with age
	
	//Setter method - age // set the data, write
	public void setAge(int value){
		age = value;
	}
	
	//Getter method -age           // get the data, write
	public int getAge(){
		return age;
	}
// Setter and getter method - city
	public void setCity(String value){
		city = value;
	}
	
	public String getCity(){
		return city;
	}


}