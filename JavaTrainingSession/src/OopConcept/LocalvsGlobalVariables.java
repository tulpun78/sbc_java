package OopConcept;

public class LocalvsGlobalVariables {
//Global variables-->class variables
	String name="tom";
	int age=25;
	public static void main(String[] args) {
		int i=10;// local variable for main method
		LocalvsGlobalVariables obj=new LocalvsGlobalVariables();
	obj.sum();
	System.out.println(i);
		System.out.println(obj.name);
	System.out.println(obj.age);
	}
	public void sum() {
		int i=15;// local variable for sum method
		int j=20;
		System.out.println(i);
		System.out.println(j);
	}

}
