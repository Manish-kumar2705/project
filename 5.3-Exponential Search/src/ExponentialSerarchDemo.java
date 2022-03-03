import java.util.*;

public class ExponentialSerarchDemo {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Please enter the key:");
			int key =sc.nextInt();
			
			int sol = exponentialSearch(arr, key);
			if(sol>=0) 
				System.out.println("key found at index: "+sol);
			else 
				System.out.println("key not present.");
			 
		
	
}
	public static int exponentialSearch(int[] arr, int key){
		int i=0;
		int n= arr.length;
		if(arr[0]==key) {
			return 0;
		}
		i=1;
		while(i<n && arr[i]<=key) {	
			i = i*2;
		}
		int end=Math.min(i, n);
		return binarySearch(arr,i/2, end, key);
		
	}
public static int  binarySearch(int[] arr,int start, int end, int key) {
		
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
