package com.upskill.java_5;

public interface Interface {
//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method doesn't have any implementation

	
	public abstract void iDoor();
	//Do two returntype abstract methods using integer and String
	//returntype abstract method - integer
	public abstract int iBobtheBuilder();
	
	
//returntype abstract method - String
	public abstract String iMasud();
	
	
	
	
}

/*(Parent)            (Keyword)         (Child)                       (Keyword)         (GrandChild)                      
  Class               extends           Class    
 Abstract CLass       extends           Class
 Interface          implements          Class  
 Interface           extends            Interface (can't implement     implements       Class
                                         because it 
                                       needs regular class; 
                                         interface doesn't 
                                        create regular class)
*/