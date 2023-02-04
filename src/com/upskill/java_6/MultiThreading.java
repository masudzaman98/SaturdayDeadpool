package com.upskill.java_6;

public class MultiThreading {
	/* Multithreading is a Java feature that allows concurrent execution.

 * Threads can be created by using two mechanisms:
	
	 * 1. Extending the Thread class
	 * 2. Implementing the Runnable Interface	 */

	
	public static void main(String[]args){
	ForLoop();
	}
	

	public static void ForLoop() {
			    int n= 10;                            
			   for(int i= 0; i<n;i++){               
				 MultiThreadingThread obj = new MultiThreadingThread();
				   obj.start();
				   
				   Thread obj2 = new Thread(new MultiThreadingRunnable());
				   obj2.start();
	}
	}
	
	}
		 
