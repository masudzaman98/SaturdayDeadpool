package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{
//Polymorphism is the ability of an object to take on many forms.
//	- Method Overloading (compile time polymorphism/static binding) Same method name with different signature to overload.
	
	public static void main(String[] args) {
	car();	
	car(1000);
    car("Moon");
    car(6,"Single");
	
    Polymorphism obj = new Polymorphism();
    obj.annualIncome();
    
	}
	//Method overriding (Runtime polymorphism/Dynamic binding) Same method name from Parent class to override.
	
public void annualIncome(){
	System.out.println("My Annual Income = 150000");
}
	public static void car(){
		System.out.println("My car is Toyota!");
	}
	public static void car (int hp){
		System.out.println("My car is Toyota!" + "It has a new engine: " +  hp);
	}
	
	
	
	public static void car (String roof){
		System.out.println("My car is BMW!" + " It has a roof like any other car! " +  roof);
	}
	public static void car (int battery, String motor){
		System.out.println("My car is Tesla! " + "It has a battery: " + battery + " It has a motor: " + motor);
	}
}
