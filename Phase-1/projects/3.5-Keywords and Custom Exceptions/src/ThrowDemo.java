class Test{   
   
    public static void vote(int age) {  
        try {
        	if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("not eligible");    //throws exception, catch will catch this
        	} 
        }
        catch (ArithmeticException e) {		//catching the throw exception
			System.out.println(e.getMessage());
		}
        	
        
        if(age>=18) {  
            System.out.println("eligible");  
        }  
    }
}
public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob= new  Test();
		ob.vote(13);  
	         
	}

}
