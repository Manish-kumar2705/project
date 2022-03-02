// code depicting single level inheritance. 
class Animal{  
	void eat()
	{
		System.out.println("eating");}  
	} 

class Dog extends Animal{  
	void bark()
	{	
		System.out.println("barking");}  
	}  

class inheritance{  
	public static void main(String args[]){  
	 Dog obj=new Dog();			//object of child can inherit parents behaviors.
	 obj.bark();
	 obj.eat();

	}
}  

