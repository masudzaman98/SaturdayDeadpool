package com.upskill.java_2;

public class MethodType {
	
/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncome();
		
		weeklyIncome();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncome());
	}
		
	//void Method
	public void annualIncome(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//static Method
	public static void weeklyIncome(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//return type method
	public int monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
		
	}
	
   



public static void masud(){				//method
	String name ="Masud Zaman";			//variable
	int age = 24;
	System.out.println(name);
}

public void masud2(){					//method
	String name ="Masud Zaman";			//variable
	int age = 24;
	System.out.println(name);
}

public int masud3(){					//method
	String name ="Masud Zaman";			//variable
	int age = 24;
	System.out.println(name);
	return age;
}


// Write down a String static method

    public static String mymethod(){
    	String name="Rasel Bhai";
    		return name;
    }
    
//Write down static int return type method

public static int dailyIncome(){
	int calculateDailyIncome= hourlyIncome* 8;
	System.out.println("My Daily Income = " + calculateDailyIncome);
	return calculateDailyIncome;
	 
 }

}



