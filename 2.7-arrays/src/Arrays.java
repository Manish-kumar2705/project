import java.util.Scanner;

//array implementation
class Student{
	int rollno;
	String name;
	Student(int rollno, String name){
	this.rollno = rollno;   //this keyword to remove ambiguity beetween local and global variable;
	this.name = name;
	}
	
}



public class Arrays {
	public static void main(String[] args) {
		//array of objects
	
		Student s[] = new Student[4];
		s[0] = new Student(1, "ankit");
		s[1] = new Student(2,"manish");
		s[2] = new Student(3, "atut");
		s[3] = new Student(4,"poish");
		
		for(int i=0 ; i<s.length; i++) {
			System.out.println(s[i].rollno +" : "+ s[i].name);  //obj.objProperty
		}
		
		//2d array
		int[][] a= new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		
		for(int i = 0 ; i<2; i++) {
			for(int j=0; j<2; j++) {
					System.out.println(a[i][j]);
				}
		}
	}
	
}



