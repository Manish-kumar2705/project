class MyException extends Exception{
	public MyException(String s) {
		super(s);			//this will call the constructor of parent class i.e Exception.
	} 
}

public class customException {
	public static void main(String[] args) {
	int age=8;
	  try {
      	if(age<18) {  
          //throw Arithmetic exception if not eligible to vote  
          throw new MyException("not eligible");    //custom exception- u created ur own logic to throw error if age<18
      	} 
      }
      catch (MyException e) {		//catching the throw exception
			System.out.println(e.getMessage());
		}

	}
}