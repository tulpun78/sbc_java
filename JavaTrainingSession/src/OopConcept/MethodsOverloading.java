package OopConcept;

public class MethodsOverloading {

	public static void main(String[] args) {
		MethodsOverloading obj=new MethodsOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	// you can't create a method inside a method
	// duplicate methods-->that is same method with same parameters not allowed
	// yes we can overload main method
		//method overloading-->when the method name is same with different arguments or parameters within the same class
		public void sum() {// o input parameter
		System.out.println("sum method");
		}
		public void sum(int i) {//1 input param
			System.out.println("sum method");
			System.out.println(i);
	}
        public void sum(int j,int k) {//2 input params
        	System.out.println("sum method");
        	System.out.println(j+k);
        }
}
