

	interface test1{
		 public default void display()   
		 {
			System.out.println("interface1");  
		}  
	} 
	
	interface test2 
	{  
		public default void display()   
		{  
			System.out.println("interface2");  
		}  
	} 
	
	public class DiamondProblem implements test1,test2  
	{  
		public void display()   
		{  
			test1.super.display();  
			test2.super.display();  
		}  
		public static void main(String args[])   
		{  
			DiamondProblem obj = new DiamondProblem();  
			obj.display();  
		}  
	}

