package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashtset_HashTable {

	public static void main(String[] args) {
		// Array store multiple data using index
		
		
		int age = 30;                                  //Variable
		int[] ageDeadpool = new int[]{25, 21, 35, 30, 40};  //Array
	
		//Array index      [0] [1] [2] [3] [4]
		
		System.out.println("Student Age: " + ageDeadpool[1]);
		System.out.println("Total Student: " + ageDeadpool.length);
		
    String[] Deadpoolclass = new String[] {"Tahin", "Masud", "Shishir", "Tanzu", "Intishar", "Zaman", "Sumi"};
    System.out.println("Student name: " + Deadpoolclass[1]);
    System.out.println("Number of students in Deadpool: " + Deadpoolclass.length);
	
	//nameCity
    String[] nameCity = new String[] {"New York", "Sylhet", "Tokyo", "Dhaka", "England is my City"};
    System.out.println("Pick a city: " + nameCity[4]);
    System.out.println("Total cities: " + nameCity.length);
  	  
    // Multi-Dimensional Array
    int[][] ageUpskill2D = {{25, 21, 35, 30, 40},        //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
    	                 	{24, 28, 29, 30}};         // [1][0] [1][1] [1][2] [1][3] [1][4]
    System.out.println("Student Age 2D: " +ageUpskill2D[0][3]);
    
   //2D Names
String[][] name2D = {{"Tahin", "Masud", "Tanzu", "Shishir", "Intishar"},
                 {"Rezwan", "Shamme", "Sumi", "Zaman", "Kamal"}};
 System.out.println("Student Name 2D: " +name2D[0][2]);
 
 // Hashmap stores multiple data using key-value pair, Implementation of map interface
 
 HashMap<String, Integer> Student = new HashMap<String, Integer>();
 Student.put("Tanzu", 25);
 Student.put("Tahin", 21);
 Student.put("Masud", 24);
 Student.put("Shishir", 24);
 Student.put("Fahim", 44);
 Student.put("Zaman", 22);
 System.out.println("Hashmap Student Age: " + Student.get("Shishir"));
	
 
 // Hashmap for "Capital City"
 
 HashMap<String, String> Capital = new HashMap<String, String>();
 Capital.put("USA", "New York");
 Capital.put ("Qatar", "Doha");
 Capital.put("India", "New Delhi");

 System.out.println("Hashmap Capital City: " + Capital.get("Qatar"));
	
 
   //HashSet stores unordered collection containing unique value, Implementation of Set interface. 
 // HashSet has No Duplicate data
 
 HashSet<String> car = new HashSet<String>();
 
 car.add("BMW");
 car.add("Toyota");
 car.add("Audi");
 car.add("Ford");
 
System.out.println("Car:" + car);

HashSet<String> capital = new HashSet<String>();

capital.add("Washington DC");
capital.add("Tokyo");
capital.add("Lahore");
capital.add("Dhaka");

System.out.println("Capital:" + capital);
	

//Hashtable stores multiple data using key-value pair, no duplicate, also is synchronized (only one thread can be modified)

  Hashtable<String,String> Region = new Hashtable<String,String>();
  
  Region.put("BD", "Asia");
  Region.put("USA", "North America");
  
  System.out.println("Region: " + Region.get("BD"));
  
	}
	
}
	
	

	



	



 
		 
		 
 
	


	

    
    
 
      
       
        