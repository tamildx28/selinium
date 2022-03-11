package trailprogram;
import java.util.*;

public class exercise_letters_count {

	public static void main(String[] args) {
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s1 = sc.nextLine();
		
		char [] arr = s1.toCharArray();
		
		for (int i=0;i<arr.length;i++){
			int count=0;
			for (int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					count++;
				}
			}
			map.put(arr[i],count);
		}

	System.out.print(map);
	}
}
