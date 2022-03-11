package HELLO;

public class arraystrail1 {

	public static void main(String[] args) {
		int [] ar = new int [401];
		for (int a = 0; a < ar.length; a=a+1){
        ar [a] = a*5;
        System.out.println(ar[a]);
		}
		System.out.println(ar[100]);
	}

}
   