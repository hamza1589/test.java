package Oop;

public class StudentHamza {
	int sid;
	String sname;
	char grade;
	void getValues(int id,String name,char grade) {
		// method
		sid=id;
		sname=name;
		grade='g';
		
	}
	void display() {
		System.out.println(sid+" "+sname+" "+grade);
	}

}
