package HELLO;

import java.util.Scanner;

public class alternate_reverse {

	public static void main(String[] args) {
    
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the word");
	 
	 String text1 =sc.nextLine();
	 
	 String []arr = text1.split(" ");
		for (int i=0;i<arr.length;i++){
		
			if(i%2 ==0){
				System.out.print(arr[i]);
			}
			else {
				 for (int j=arr[i].length()-1; j>=0;j--){
					 char result = arr[i].charAt(j);
					 System.out.print(result);
				 }
			}
	 System.out.print(" ");
	 
	  
		
		}

	}

}
