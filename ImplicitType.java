package Session7;
//here I have created a package as session7

public class ImplicitType {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.

	// TODO Auto-generated method stub
		 byte b= 22; //we are taking byte data type and initialized the variable as 22
         int x = 257;  //and another variable of integer data type which is greater than byte data type that is 257
         System.out.println("b : " +b+ "\n x :" +x ); 
       //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
         b=(byte)x;
         
         System.out.println("int to byte  : " +b );
       //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
         x = b ;//xequals to b
         System.out.println("byte to int  : " +x );
       //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
         int i= 180;//initializing 1 value
         float f = i;//initializing f value
         System.out.println("int to float : " +f );
       //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
         short y =(short)f;
	       System.out.println("float to short  : " +y );
	     //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.

	}

}
