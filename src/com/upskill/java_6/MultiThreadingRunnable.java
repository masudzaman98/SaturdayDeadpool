package com.upskill.java_6;
//"Runnable" is a built-in Interface from Java.
public class MultiThreadingRunnable implements Runnable {
	public void run() {
		try{
			System.out.println("Thread Number # " + Thread.currentThread().getId()+ " is Running");
		}catch (Exception e){
			System.out.println("Exception is caught");
		}		
	}

	

}
