package trailprogram;

public class Rateofinterest {
	
	public int rate(int a){
		if(100000>a && a<500000){
			System.out.print("your eligible for loan and rate of interest - ");
			return 10;
		}
		else if  (a>500000 && a<1000000) {
			System.out.print("your eligible for loan and rate of interest - ");
			return 9;
		}
		else if (a>1000000 && a<1500000){
			System.out.print("your eligible for loan and rate of interest -  ");
			return 8;
		}
		else {
			return 0;
		}
	}
}
















