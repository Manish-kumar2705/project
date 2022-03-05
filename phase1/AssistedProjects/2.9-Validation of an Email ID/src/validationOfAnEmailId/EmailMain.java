package validationOfAnEmailId;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMain {

	public static void main(String[] args) {
		 String[] email=new String[9];				//arr of strings
		 email[0]="Manish.kumar2705@gmail.com";
		 email[1]="ankit.kumar@gmail.com";
		 email[2]="shewag77@gmail.com";
		 email[3]="dhoni@gmail.com"; 
		 email[4]="virat@gmail.com"; 
		 email[5]="ajay@gmail.com"; 
		 email[6]="sunil@gmail.com";
		 email[7]="kamal@gmail.com";
		 email[8]="rohit@gmail.com";

		System.out.println("search database:\n");
		//printing database
		for(String i : email) {
		System.out.println(i);
		}
		
		//inputing user email for searching
		System.out.println("\n");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the email id for searching");
		 String inputEmail = sc.nextLine();
		 
		 //validation criteria
		 Pattern p= Pattern.compile( "^[a-zA-Z0-9.]+@[a-z]+\\.[a-z]{2,3}");
		Matcher m= p.matcher(inputEmail);
		if(m.matches()==false) {System.out.println("invalid email entered");}
		//if input matches the validation pattern then only check for match
		if(m.matches()) {
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
		 
		 
}


