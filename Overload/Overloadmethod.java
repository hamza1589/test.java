package Overload;

public class Overloadmethod {
	
	//overload is feature that allow a class
	//to have more than one method with the same name
	
	
	void add(int a, int b) {
		
	}
	void add(int a, double b) {
		System.out.println(a+b);
		
	}
	void add(double a, double b) {
		System.out.println(a+b);
		
	}
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Overloadmethod mo=new Overloadmethod();
		mo.add(10,20);
		mo.add(10,20.0);
		mo.add(1.0,  2.0);
		mo.add(10, 20,3);
		

	}

}
