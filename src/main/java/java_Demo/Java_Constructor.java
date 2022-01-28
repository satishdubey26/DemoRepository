package java_Demo;



public class Java_Constructor {
	
	
	
	//============================Default Constructor=====================================
	
	public Java_Constructor() {      // it is default constructor because it does not have any parameter
		
		System.out.println("It is Default Constructor");
	}
	
	/*============================Parameterized Constructor=====================================*/
	
	public Java_Constructor(int i,String n) { // It is Parameterized Constructor because it have specific number of parameter
		
		System.out.println("Display the value of i"+i);
		System.out.println("Display the value of n"+n);
		
	}
	
	public static void main(String[]args) {
		
		Java_Constructor DC=new Java_Constructor();				 	/* default construct is called and every time 
		 																when object is called using new() keyword 
		 																constructor will called*/
		
		Java_Constructor Dc=new Java_Constructor(5784,"Satish");	//it will called Parameterized constructor
	}
	
	/*============================Notes on Constructor=====================================
	 
	 *The default constructor is used to provide the default values to the object like 0, null,depending on the type.
	 *A constructor is called "Default Constructor" when it doesn't have any parameter.
	 *It is called constructor because it constructs the values at the time of object creation.
	 *java compiler creates a default constructor if your class doesn't have any.
	 */
	
	
}
