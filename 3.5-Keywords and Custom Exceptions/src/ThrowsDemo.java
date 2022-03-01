
class Test3{
	public static void div(int i)throws ArithmeticException{  //telling the compiler exception may occur.
       int a;
       a=i/0;
	} 
}

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj = new  Test3();
		
		try {											//fn is called in try statement to check for exception
			obj.div(13);			
		} catch (Exception e) {						//if exception occur in test3 fn. then these catch statement will run.
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
