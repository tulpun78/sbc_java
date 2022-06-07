package day6;

public class StringTopics {

	public static void main(String[] args) {
     
		String s1= "MULTIVERSE THEORY";
		String s2= "MULTIVERSE THEORY";
		char s3[]= {'M','U','L','T','I','V','E','R','S','E','T','H','E','O','R','Y'};
		String s4= new String(s1);
		String s5= new String(s3);
		String s6= "MULTIVERSEPRINCIPLE";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s1.length());
		System.out.println(s1+" " +s2+" " +s4);// concatenation of Strings
		System.out.println(s1.charAt(11)+" "+s2);
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("------------------------------");
		
		for(int j=s1.length()-1; j>=0; j--) {
			
			System.out.println(s1.charAt(j));
		}
			
			System.out.println(s2.contains(s6));
			System.out.println(s1.contains(s2));
		}
		

}
