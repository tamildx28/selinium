package trailprogram;
import java.security.KeyStore.Entry;
import java.util.*;

public class workout_map_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("physics", 100);
		map.put("english", 84);
		map.put("maths", 34);
		map.put("chemistry", 67);
		map.put("physics", 120);
		//To get the value 
		Integer value = map.get("physics");
		System.out.println(value);
		
		//To remove the value
		Integer value1 = map.remove("physics");
		System.out.println(value1);
		
		//To verify the value
		System.out.println(map.containsKey("english"));
		
		//To retrieve only the keys  
		Set<String>keys=map.keySet();
		for(String a:keys){
			System.out.println(a);
		
		//To retrieve only the values
			Collection<Integer> values= map.values();
			for (Integer b: values){
			System.out.println(b);
		//To retrieve as pair 
			
			 
			
			
			
			
		
		
			}
			
			
		}
		
		
		}	
	

}
