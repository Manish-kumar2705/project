package innerClass;


class Outer2{
	static  int i=3;		//this should also be static to be accessed by static class
					//static class cant access non static members
	static class Inner{				//can be accessed by outer class name
		void display() {
			System.out.println(i);
		}
	}
}
public class StaticInnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2.Inner ob = new Outer2.Inner(); //static member can be accessed by * Classname.FuntcionName */
		ob.display();
	
	}

}
