
public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;		//array is rotated from right by 2;
		int arr[] = new int[11];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		arr[10]=11;
		Rotate(arr,k);
		for(int i:arr)
		System.out.println(i);
	}
	public static void Reverse(int[] arr, int i, int j) {
		int li=i;
		int ri=j;
		while(li<ri) {
			int temp=arr[li];
			arr[li]=arr[ri];
			arr[ri]=temp;
			li++; ri--;
		}
	}
	public static void Rotate(int[] arr, int k) {
		k=k%arr.length;
		Reverse(arr,arr.length-k ,arr.length-1);		//2nd part
		Reverse(arr,0,arr.length-k-1);					//1st part
		Reverse(arr,0,arr.length-1);
		
	}
}
