package HELLO;
import java.util.Scanner;

public class scannertrailreverse1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String text1 = sc.next();
		char []s2= text1.toCharArray();
		for (int i=text1.length()-1;i>=0;i--){
		System.out.print(s2[i]);
		}
	}
	}