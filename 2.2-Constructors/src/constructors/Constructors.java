package constructors;

class StudentInfo{									//parent class
	int rollNo;
	String name;
	StudentInfo(){									// no argument constructor by default initialize variable with zeros and null
		System.out.println("default constructor is called\n"+ "roll no: " + rollNo +"\n"+ "name: " + name+ "\n");
	}
}



class Student extends StudentInfo{  			 //child class extending parent class
	int rollNo;
	String name;		
	Student(int rollNo , String name){						// parameterized constructor
		System.out.println("parameterized constructor is called \nroll no: " + (this.rollNo=1));
		System.out.println("Name: " + (this.name="Manish"));

	}
}



public class Constructors {

	public static void main(String[] args) {
		
		//StudentInfo obj = new StudentInfo();   //no need cause -
		Student obj1 = new Student(1,"Manish"); //child class constructors also calls the parents class constructor as well
		
	}

}
