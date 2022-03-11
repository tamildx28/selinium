package trailprogram;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class list_trailprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>List = new ArrayList <Integer>();
		//To add values
		List.add(56);
		List.add(76);
		List.add(34);
		List.add(50);
		int a = 10;
		List.add(a);
		System.out.println(List);
		
		//To retrieve a value
		int value = List.get(3);
		System.out.println(value);
		
		//To update value
		List.set(3, 120);
		System.out.println(List);
		
		//To insert 
		List.add(1,15);
		System.out.println(List);
		
		//To delete
		List.remove(1);
		System.out.println(List);
		
		//To know the size//
		System.out.println(List.size());
		
		
		//To check value
		System.out.println(List.contains(34));
		
	
		
		
	
		
		
		
		
		
		
		
	}

}
