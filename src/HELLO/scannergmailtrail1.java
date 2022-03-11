package HELLO;

import java.util.Scanner;

public class scannergmailtrail1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mailid");
		String s1 = sc.next();
		String [] arr = s1.split("@");
		if ( (arr.length == 2)){
			System.out.println(" Invalid format");}
	    
		if ( (arr[0].length() >2 && arr[0].length()<8)) {
			System.out.println("Invalid username");}
			
		 if ((arr[1].equals("gmail.com"))) {
			System.out.println("Invalid domain "); 
		 }
		 else {
			 System.out.println("Your mailid is accepeted");
		 }
		}
		}

	

