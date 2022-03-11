package HELLO;

public class arraytrail3 {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 2, 1, 8,12,66 ,85,55,63,56,56,89};
		int temp;
		for (int i= 0; i<arr.length; i=i+2){
			temp= arr [i];
			arr[i]=arr[i+1];
			System.out.print(arr[i]);
			arr[i+1]=temp;
			System.out.print(temp);
			} 
}
}
