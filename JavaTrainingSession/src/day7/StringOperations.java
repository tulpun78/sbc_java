package day7;

public class StringOperations {

	public static void main(String[] args) {
    
		String s="tom, jerry";
		System.out.println(s.replace('t','k'));
		String s2=" hello,sagar " ;
		System.out.println(s2.trim());
		System.out.println(s2.trim().toUpperCase());
		StringBuffer buff= new StringBuffer("life is good");
		buff.insert(3,'y');
		System.out.println(buff);
	}

}
