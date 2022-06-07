package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array: to store similar data types value in a array vaiable:
		//one dimensional array:
		//1. int array:
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i.length);
		//print all the value of arrays:use for loop
		for(int j=0;j<4;j++) {
		System.out.println(i[j]);
		}
		//double array
		double d[]=new double[5];
		d[0]=10.3;
		d[1]=11.4;
		d[2]=12.5;
		d[3]=13.44;
		d[4]=14.69;
		System.out.println(d[2]);
		System.out.println(d.length);
		for( int b=0;b<d.length;b++) {
			System.out.println(d[b]);
		}
		//char array:
		char c[]=new char[4];
		c[0]='a';
		c[1]=2;
		c[2]='$';
		c[3]='d';
		System.out.println(c.length);
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		//string array
		String s[]=new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s.length);
		 
		//object array: to store different data types value
		Object ob[]=new Object[6];
		ob[0]="tom";
		ob[1]=25;
		ob[2]=12.66;
		ob[3]="1/1/2099";
		ob[4]='m';
		ob[5]="london";
		System.out.println(ob[4]);
		System.out.println(ob.length);
				
		
		}
			

	}

