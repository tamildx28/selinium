package HELLO;

public class exercise1 {

	public static void main(String[] args) {
	int p=90;int c=80;int m=95;
	int t=(p+c+m);
    System.out.println(t);
    if (t<70){
       System.out.println("fail");
    }
    else if(t>70&&t<150){
    	System.out.println("pass");
    }
    else if (t>100&&t<250){ 
    	System.out.println("first class"); 
    }
    else if (t>250){
    	System.out.println("distinction");
    }
	}
}
