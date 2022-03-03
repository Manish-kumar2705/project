
public class SelectionSortDemo {
	public static void main(String a[]){  
        int[] arr = {9,1,03,5,4,11,55,72};  
        
        selectionSort(arr);
         
        System.out.println("Sorted array");  
        for(int i=0; i<arr.length; i++){  
            System.out.print(arr[i]+" ");  
        }  
    }  
	 public static void selectionSort(int[] arr){  
		 int minIndex;
	        for (int i = 0; i < arr.length-1; i++){  
	            	minIndex = i;  
	            for (int j = i+1; j<arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    minIndex = j;
	                }  
	            }  
	            int min= arr[minIndex];   
	            arr[minIndex] = arr[i];  
	            arr[i] =min;  
	        }  
	    }  
	       
	    
	
}
