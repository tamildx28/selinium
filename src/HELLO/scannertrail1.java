package HELLO;

import java.util.Scanner;

public class scannertrail1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the values");		
		int sum=0;
		for(int i=0; i<array.length;i++){
			array[i]= sc.nextInt();
	sum=sum+array[i];
}
System.out.println("The sum is  "+sum);
	}

}
