package validationOfAnEmailId;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailMain {

	public static void main(String[] args) {
		 String[] email=new String[9];
		 email[0]="manish.kumar@gmail.com";
		 email[1]="ankit.kumar@gmail.com";
		 email[2]="shewag@gmail.com";
		 email[3]="dhoni@gmail.com"; 
		 email[4]="virat@gmail.com"; 
		 email[5]="ajay@gmail.com"; 
		 email[6]="sunil@gmail.com";
		 email[7]="kamal@gmail.com";
		 email[8]="rohit@gmail.com";

		System.out.println("search database:\n");
		for(String i : email) {
		System.out.println(i);
		}
		System.out.println("\n");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the email id for searching");
		 String inputEmail = sc.nextLine();
		 
		 
		 
		int i=0;
		 while( i < email.length) {
			 boolean res =	Pattern.matches(email[i], inputEmail);
			 if(res) {
			 System.out.println("Email Match is found" );
			 break;
			 }
			 i++;
		 } 
		 if(i==email.length) {
			 System.out.println("email match not found");
		 	}
		 sc.close();
	 }
		 
		 
		 
}


