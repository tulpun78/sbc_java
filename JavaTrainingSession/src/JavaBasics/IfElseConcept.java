package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		if (b>a){
		System.out.println("b is greater than a");
		}	
		else{
			System.out.println("a is greater than b");
		}
		int c=30;
		int d=40;
		if (c==d) {
			System.out.println( "c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		int a1=10;
		int a2=30;
		int a3=40;
		if (a1>a2 & a1>a3) {
			System.out.println("a1 is the greatest");
		}
		else if(a2>a3){
			System.out.println("a2 is the greatest");
		}
		else {
			System.out.println("a3 is the greatest");
		}
	}
	}
       

