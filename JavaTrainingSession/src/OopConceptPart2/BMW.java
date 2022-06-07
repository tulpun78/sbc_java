package OopConceptPart2;
// when same method is present in parent class as well as in child class with the same name and same number of args,
//it is called Method overriding

public class BMW extends Car{// "has a relationship"
	public void start() {
		System.out.println("BMW---start");
	}
    public void theftSafety() {
    	System.out.println("BMW--theftSafety");
    }
}
