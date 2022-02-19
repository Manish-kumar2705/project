package typecasting;

public class TypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explict typecasting
		double friends= 10;
		int  var= (int)friends/3;
			System.out.println("double=10 is converted into int by explict type conversion to "+var);
			
			//implict typecasting
			char c = 'a';
			int i = c;
			System.out.println("char='a' datatype is automatically conveted to int by implict typecasting to "+i);
	}

}
