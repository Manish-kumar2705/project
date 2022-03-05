
class MyException extends Exception{
	   MyException(String str2) {
		   super(str2);
	   }
}


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int age=8;
			  try {
		      	if(age<18) {  
		          //throw Arithmetic exception if not eligible to vote  
		      		System.out.println("try block");
		          throw new MyException("not eligible" );    //custom exception- u created ur own logic to throw error if age<18
		      	} 
		      }
		      catch (MyException e) {		//catching the throw exception
		    	  System.out.println("catch block");
					System.out.println(e);		//i think this is printing the super at line 4; e is the obj of myexception
				}

			}
	}


