package HELLO;

public class trail1 {

	public static void main(String[] args) {
		int sumeven = 0;
		int sumodd = 0; 
		for (int a=1; a<=100; a++){
			if (a % 2==0){
			 	sumeven = sumeven + a;
			 	
			}
			else {
				sumodd=sumodd + a;
		}
	}
	System.out.println(sumeven);
	System.out.println(sumodd);
	}
}