package innerClass;

abstract class Outer {
		void display() {}
	}

	public class AnonymousClass{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Outer ob =new Outer() {    //outerclassobj
				void display() {
					System.out.println("implementation anonymous nameless class for abstract method ");
				}
				
			};
			ob.display();
		}


}