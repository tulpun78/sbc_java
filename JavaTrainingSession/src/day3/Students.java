package day3;

public class Students {
int id;
String name;
void insertRecord(int i,String n) {
	id=i;
	name=n;
}
void displayInfo(){
System.out.println("student id is:"+id);
System.out.println("student name is:"+name);
}

}
