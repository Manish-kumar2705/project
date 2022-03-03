
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int arr[] = { 15, 20, 68, 59, 35, 76, 97 , 38, 70, 92};
		
		int[] dp = new int[arr.length];
		
		
		int overallMax=0;
		for (int i=0; i< dp.length; i++) {
			int max=0;
			
			 for(int j = 0; j < i; j++ ) {
				 if(arr[j] < arr[i]) {
					 if(dp[j] > max) {
						 max = dp[j];
					 }
				 }
			 }
			 dp[i] = max + 1; 
			 if(dp[i]>overallMax) {
				 overallMax=dp[i];
			 }
		}
		System.out.println(overallMax);
	}

}
