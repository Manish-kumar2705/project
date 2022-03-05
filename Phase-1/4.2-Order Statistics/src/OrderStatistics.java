import java.util.Arrays;
import java.util.Scanner;
public class OrderStatistics {
	
	public static void main(String[] args) {
		int[] arr = { 5,2,1,4,78,45,9,56 };
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter kth element to search in array:");
			int k = sc.nextInt();
			int result = OrderStatistics.kthSmallestElement(arr, k);
			System.out.println("result:" + result);	
		}
			

	}
	static int kthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);					//Array is class defined in util.
		return arr[k - 1];
		}

	
}
