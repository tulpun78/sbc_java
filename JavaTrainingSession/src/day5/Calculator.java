package day5;

public class Calculator {
	private int addition;
	private int substraction;
	private int multiplication;
	
	
	public Calculator(int a,String b, int c) {
		System.out.println(" this constructor takes two int variable and one string varible");
	}
	public Calculator() {
		System.out.println("This is parameterless constructor");
	}
	
	public Calculator(int addition) {
		System.out.println("This constructor takes one int type parameter i.e "+addition);
	}
	
	public Calculator(String addition) {
		System.out.println("This constructor takes one string type parameter i.e "+addition);
	}
	
	public Calculator(int addtion , int substraction) {
		System.out.println("This constructor take two parameters i.e "+addition + "," + substraction );
	}
	
	public Calculator(int addition , int substraction, int multiplication) {
		System.out.println("This constructor take three parameters i.e " + addition + "," + substraction + "," + multiplication);
	}
	
	public int getAddition() {
		return addition;
	}
	
	public void setAddition(int addition) {
		this.addition = addition;
	}
	
	public int getSubstraction() {
		return substraction;
	}
	
	public void setSubstraction(int substraction) {
		this.substraction = substraction;
	}
	
	public int getMultiplication() {
		return multiplication;
	}
	
	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}
}
