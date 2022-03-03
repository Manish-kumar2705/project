
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(); 
		s.push(45); 
		s.push(55); 
		s.push(65); 
		s.pop(); 

	}
	
	static final int Max = 100;
	int top;
	int a[] = new int[Max];
	boolean isEmpty()
	{
		if(top<0) {		//because constructor is initializing top =-1, so it will be -ve if empty.
			return true;
		}
		return false;
	}
	Stack() //constructor
	{ 
		top =-1;		
		
	}
	boolean push(int x) {
		if(top>=Max) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+ " pushed element into stack");
			return true;
			
		}
	}
	boolean pop() { //pop top element of the stack
		if(top>=0) {
			System.out.println(a[top--]+ " element poped out of the stack");
			return true;
		}
		else {
			System.out.println("stack underflow");
			return false;
		}
	
	}
}


