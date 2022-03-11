package trailprogram;

import java.util.*;

public class workout_program2 {

	public static void main(String[] args) {
		// SET TRAIL PROGRAM
		 Set<Integer> Set  = new HashSet<Integer>();
		 
		 Set.add(56);
		 Set.add(34);
		 Set.add(12);
		 Set.add(98);
		 Set.add(12);

		 for(Integer a:Set){
			 System.out.println(a);
		 }
		 Set.remove(56);
		 System.out.println(Set);
		 
	}

}
