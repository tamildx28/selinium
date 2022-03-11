package trailprogram;
import java.util.Scanner;
public class indextrail1 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("input 1");
	 String s1 = sc.nextLine();
	 System.out.println("input 2");
	 String s2 = sc.nextLine();
	 
	 int count = 0;
	 String [] a = s1.split(" ");
	 for (int i = 0; i<a.length; i++){	 
		 if (a[i].contains(s2))
			 count++;
		 
	 }
	 System.out.println(count);
	}
	

}
