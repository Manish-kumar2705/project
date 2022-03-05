package access_modifiers;

class private_access{
	
	private void display() {
	System.out.println("hi, i am private access specifier");
	}
	
}

public class Private_access_specifier {
	public static void main(String[] args) {
		
		private_access o =  new private_access();
		//o.display();
		//private methods are only accessible inside its own class.
	}

}
