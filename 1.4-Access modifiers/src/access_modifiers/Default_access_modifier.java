package access_modifiers;

class Default{
	void print() {
	System.out.println("this is default class modifier");
	}
}

public class Default_access_modifier {
	public static void main(String[] args) {
		Default d =new Default();
		d.print();
	}
	

}
