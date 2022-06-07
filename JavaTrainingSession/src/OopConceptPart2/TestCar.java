package OopConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//static polymorphism---compile time polymorphism
   BMW b=new BMW();
   b.start();
   b.stop();
   b.refuel();
   b.theftSafety();
   b.engine();
	System.out.println("-----");
Car c=new Car();
c.start();
c.stop();
c.refuel();
 // not allowed >>> c.theftSafety();
// top casting
 Car c1=new BMW(); // child class object can be referred by parent class reference variable>> is called dynamic 
 // polymorphism or run time polymsm
 c1.start();
 c1.stop();
 c1.refuel();
  // not allowed c1.thetSafety();
 // down casting
 BMW b1=(BMW)new Car();// ClassCastException error
	}
}