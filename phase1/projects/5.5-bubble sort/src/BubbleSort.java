public class BubbleSort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {6,5,3,18,7,2,4};
			bubbleSort(arr);    					//classname.fn_name= way to call static fn.it works without it as well, maybe beacause they are in same class
			print(arr);
	}
	static void bubbleSort(int[] arr) {
			int n= arr.length;
		for(int i=0; i<n-1; i++) {						//last element is already sorted, thats why n-1;
			for(int j=0; j<n-1-i; j++) {				//every outer loop, an element gets sorted so no need to check again
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	static void print(int[] arr) {
		int n= arr.length;
		for(int i=0; i<n; i++) {
			
				System.out.println(arr[i]+ " ");
			
		}
	}

}
