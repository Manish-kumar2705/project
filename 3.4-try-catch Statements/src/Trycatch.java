

public class Trycatch {
	public static void main(String[] args) {
		int a=1;
		try {
			a=5/0;
			System.out.println(a);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("cant divide by zero");
		}
	}
}
