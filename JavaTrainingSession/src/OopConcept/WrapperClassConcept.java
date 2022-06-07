package OopConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="100";
//data conversion:String to int
System.out.println(x+20);
int i=Integer.parseInt(x);
System.out.println(i+20);
// integer,double, character, boolean
//string to double conversion
String y="12.67";
double d=Double.parseDouble(y);
System.out.println(d+10);
//String to Boolean
String k="true";
boolean b=Boolean.parseBoolean(k);
System.out.println(b);
// int to String conversion
int j=200;
System.out.println(j+20);
String l=String.valueOf(j);
System.out.println(l+20);
String z="100a";
Integer.parseInt(z);// number format exception--> for input string "100a"
	}

}
