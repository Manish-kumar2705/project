import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter key to search");
		int key=sc.nextInt();							//input key
		int sol=linearSearch(arr,key);					//calling fn
		if(sol>=0)
		System.out.println("key found at index: "+sol);
		else
			System.out.println("key not present.");
	}
	public static int linearSearch(int[] arr,int  key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		
		}
	
		return -1;
	} 

}
