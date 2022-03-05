package methodOverloading;
//code depicting method overloading. which method to run is determined during compile time
class TestOne{
	int a,b;
	void add(int a, int b, int c) {							// three arguments
		System.out.println("method overloading(3 arguments): sum is  " + (a+b+c));
	}
	void add(int a, int b) {								//two  arguments
		System.out.println("method overloading(2 arguments): sum is " + (a+b) );
		
	}
	
	int square(int a) {										//method to be overridden //call by value
		this.a=a*a;
		System.out.println("TestOne method");
		return this.a;
	}
	
}

class TestTwo extends TestOne{
	int a=150;
	 public int square(int a) {							//method overriding
		this.a = a*a;
		System.out.println("method overridding is presenting the sqaure of a value:");
		return (this.a);								//this keyword referring to the instance of the class
	}
}

public class MethodOverloading {
public static void main(String[] args) {
	TestOne obj1 = new TestOne();
	obj1.add(5,5,5);									// calling add function with 3 arguments
	obj1.add(6, 6);										// calling add function with 2 arguments.
	
	//-------------------->>objects for class testtwo
	//TestTwo obj2 =  new  TestOne();  child class cant override parent;
	TestOne obj2 = new TestTwo();		          //obj2 is reference  variable of type TestOne referring to the object of TestTwo; 
	System.out.println(obj2.square(9));
		
}

}
