package trailprogram;
import java.util.*;

public class exception_trail {

	public static void main(String[] args) {
		
		System.out.println(1);
        
		System.out.println(2);
	    
		int i=0;
		int [] arr = new int [2];
		try{
		System.out.println(arr[6]);
		System.out.println(3/i);
		System.out.println(3.5);
		}
		catch (ArithmeticException e){
			System.out.println(3/i++);
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Recieved index bound");
		}
		catch (Exception e){
			 
		}
	}
}
