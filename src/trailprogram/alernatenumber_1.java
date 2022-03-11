package trailprogram;

import java.util.ArrayList;

public class alernatenumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {3,5,8,-1,0,2,3,-2,4,6,8 ,2  };
		
		ArrayList<Integer>List = new ArrayList<Integer>();
		ArrayList<Integer>List1 = new ArrayList<Integer>();
		
	for (Integer i:arr){
		List.add(i);
	}
		
		for (int i = 0; i<=arr.length+1; i++) {
			if(arr[i]<arr[i+1])
			{
				List1.add(arr[i]);
				
			}
			else {
				List1.add(arr[i]);
				System.out.println(List1);
				List1.clear(); 
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
