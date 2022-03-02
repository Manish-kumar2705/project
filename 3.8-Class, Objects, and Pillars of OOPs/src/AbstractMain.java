abstract class Shape{
	abstract void area();
	final double pi=3.14d;
}
class rectangle extends Shape{
	int l ,b;	
	rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	void area() {
		System.out.println("area of rectangle:"+(l*b));
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle d = new rectangle(5,4);
		d.area();
		
	}	

}
