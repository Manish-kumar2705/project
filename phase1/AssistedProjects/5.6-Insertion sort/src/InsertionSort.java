public class InsertionSort {
	
	public static void main(String a[]){  
       int[] arr = {9,1,03,5,4,11,55,72};  
        
       insertionSort(arr);
         
       System.out.println("Sorted array"); 
       
       for(int i=0; i<arr.length; i++){  
    	   
           System.out.print(arr[i]+" ");  
       }  
   }  
	public static void insertionSort(int[] arr){  
		 int j;
	        for (int i =1; i<arr.length; i++){  
	        	
	        	int current = arr[i];
	        	
	            for (j=i-1; j>=0 && current<arr[j]; j--){  // to get descending order, just change current>arr[j]
	            	
	                arr[j+1] = arr[j]; 
	            }  
	            arr[j+1] = current; 
	        }  
	 }  
	       
}


