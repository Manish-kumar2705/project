package constructors;

class StudentInfo{									//parent class
	int rollNo;
	String name;
	StudentInfo(){									// no argument constructor
		System.out.println("default constructor is called\n"+ rollNo + " " + name+ "\n");
	}
}



class Student extends StudentInfo{  			 //child class extending parent class
	int rollNo;
	String name;		
	Student(int a , String s){						// parameterized constructor
		System.out.println("parameterized constructor is called \nroll no: " + (this.rollNo=1));
		System.out.println("Name " + (this.name="Manish"));

	}
}



public class Constructors {

	public static void main(String[] args) {
		
		//StudentInfo obj = new StudentInfo();   //no need cause -
		Student obj1 = new Student(1,"Manish"); //child class constructors also calls the parents class constructor as well
		
	}

}
