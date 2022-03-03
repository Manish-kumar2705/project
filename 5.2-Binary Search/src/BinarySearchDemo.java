import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Please enter the key:");
			int key =sc.nextInt();
			
			int sol = binarySearch(arr, key);
			if(sol>=0) 
				System.out.println("key found at index: "+sol);
			else 
				System.out.println("key not present.");
			 
		
	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length;
		
		
		int mid = (start+end)/2;
		
		while(start <= end) {
			
			if(arr[mid] == key) 
				return mid;
			
			else if(arr[mid]<key) {
				start=mid+1;
			mid = (start+end)/2;
			}
			 else {
				end = mid -1;
				mid = (start+end)/2;
			 }
			
		}
		return -1;
	}

}