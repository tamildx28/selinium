package trailprogram;

public class creditlimit {

	 public boolean display (int a, int b){
		 
		 if (a>100000 && a<500000 &&b>25000){
			 return true;
			 
		 }else if ( a<1000000 && b>50000){
			 return true;
		 }
		 else if (a < 1500000 && b>100000){
			 return  true;
		 }

		 else {
			 return false;
		 }
	 }
}

