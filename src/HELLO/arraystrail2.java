 package HELLO;

import org.omg.Messaging.SyncScopeHelper;

public class arraystrail2 {

	public static void main(String[] args) {
		int [] num = {8,6,13,9,3,12}; 
		
		int highnumber = num [0]; 
		
		for (int i=0; i<num.length; i++){
			
		if(num[i]>highnumber)
			highnumber = num[i];
		}
	
		System.out.println(highnumber);
	}
}
