package trailprogram;
import java.util.*;
public class alernateprogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {2,5,7,10,3,5,8,0,-1,3,5,2,4,6};
        
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Integer> list1 = new ArrayList<Integer>();
       ArrayList<Integer> sumlist = new ArrayList<Integer>(); 
        
       for (int i:arr) {
    	   list.add(i);
    	   
       }
        System.out.println(list);
        
        int sum = 0;
        int f=list.size()-1;
        for(int j=0;j<list.size()-1;j++){
        	int h=j+1;
        	if ((list.get(j)<list.get(j+1))) {
        		list1.add(list.get(j));
        		sum = sum + list.get(j);
        		
        	}
        	else {
        		list1.add(list.get(j));
        		System.out.println(list1);
        		sum = sum + list.get(j);
        		sumlist.add(sum);
        		
        		System.out.println("The sum is " +sum);
        		list1.clear();
        		System.out.println("The sumlist is " + sumlist);
        		sum = 0;
        	}
        	if(h==f)
        	{
        		list1.add(list.get(j+1));
        		System.out.println(list1);
        		sum = sum + list.get(j+1);
        		sumlist.add(sum);
        		
        		System.out.println("The sum is " + sum);
        		list1.clear();
        		System.out.println("The sumlist is  " + sumlist);
        		
        	}
        	}
        System.out.println(f);
        int max = sumlist.get(0);
        for (int k=0;k<sumlist.size();k++){
        	if(sumlist.get(k)>max){
        		max = sumlist.get(k);
        	}
        }
        
        System.out.println(" The maximum sum list " + max   );
        
        
        
        }
        

}
