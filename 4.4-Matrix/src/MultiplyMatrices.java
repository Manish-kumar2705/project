
public class MultiplyMatrices 
{
public static void main(String[] args) 
{
      	int r1 = 4;
      	int c1 = 3;
        int r2 = 3;
        int c2 = 4;
        int[][] first= { {9, 3, 8}, {7, 10, 4}, {1, 4, 3} ,{7, 5, 8}};   			//c1=r2 condition 
        int[][] second= { {4,0, 3,5}, {1,-9, 0, 6}, {1,0,4,2} };
        multiplyMatrices(first,second,r1,c1,c2);

}	

public static void multiplyMatrices(int[][] first, int[][] second, int r1, int c1, int c2) 
	{
        int[][] sol=new int[r1][c2];
        	for(int i = 0; i < r1; i++) 			//row
        		{
            		for (int j=0; j<c2; j++) 		//col
            			{	
                		for (int k=0; k<c1; k++) 	// internal element in col of 1st matrix or say rows of 2nd matrix.  //c1=r2 condition  
                			{
                    			sol[i][j] += first[i][k] * second[k][j];
                			}
            			}
       	 		}


        System.out.println("Product of two matrices: ");
        		for(int i=0; i<r1; i++) 
        		{
        			for(int j=0; j<c2; j++) 
        			{
                		System.out.print(sol[i][j]+ "   ");		//4x4   r1xc2
            			}
            		System.out.println("\n");
        		}
	}
}

