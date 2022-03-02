import java.util.Scanner;

public class RangeDemo {


	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter left range ");
			int l = sc.nextInt();
			System.out.println("Enter right reange: ");
			int r = sc.nextInt();
			System.out.println("Sum: "+RangeDemo.sum(arr, l, r));
		
	}

	public static int sum(int[] arr, int l, int r) {
		int s=0;
		for (int i = l; i <= r; i++) {
			s = s+arr[i];
		}
		return s;
	}

}
