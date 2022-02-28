package innerClass;


class OuterClass{
	private int i=3;
	class Inner{					//innerclass
		void display() {
			System.out.println(i);
		}
	}
}
public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass ob =new OuterClass();     //outerclassobj
		OuterClass.Inner ob2 = ob.new Inner(); //inner class obj is created inside the instance of outer class
		ob2.display();

	}

}
