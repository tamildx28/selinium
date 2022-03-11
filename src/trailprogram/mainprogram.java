package trailprogram;

import java.util.Scanner;

public class mainprogram {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter loan amount");
		 int loan=sc.nextInt();
		 System.out.println("Enter credit");
		 int credit=sc .nextInt();
		 
		 creditlimit obj=new creditlimit();
		 salary salrry=new salary();
		 Rateofinterest ROI=new Rateofinterest();	 
		 boolean S=obj.display(loan, credit);
		 if (S== true){
			 int rateofinterest=ROI.rate(loan);
			 System.out.print(rateofinterest);
		 }
		 else {
			 System.out.println("Enter salary");
			 int salary=sc.nextInt();
			 
	     boolean amount=salrry.amount(loan,salary);
			 if (amount==true){
				 int rateofinterest=ROI.rate(loan);
				 System.out.println(rateofinterest);
			 }
			 else{
				 System.out.println("Not eligible for loan");
			 }
		 }
		 
	}

	}


