package OopConcept;

public class CallbyValAndCallbyRef {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyValAndCallbyRef obj=new CallbyValAndCallbyRef();
			int x=10;
			int y=20;
		obj.testSum(x,y); // call by value or pass by value
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	public int testSum(int a,int b) {
			int c=a+b;
			return c;
	}
	//call by reference
	public void swap( CallbyValAndCallbyRef t) {
		int temp;
		temp=t.p;//temp=50
		t.p=t.q;//temp=60
		t.q=temp;
		}
	}


