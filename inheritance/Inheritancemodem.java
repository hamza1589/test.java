package inheritance;
class A // Parent class
{
	int a;
	void display() {
		System.out.println(a);
	}
}
class B extends A // B is  class child, A is parent class
{
	int b;
	void print() {
		System.out.println(b);
		
		
	}
}

public class Inheritancemodem {
	

	public static void main(String[] args) {
		A obj=new A();
		obj.a=100;
		obj.display();
		B bobjct=new B();
		bobjct.b=200;
		bobjct.a=300;
		bobjct.display();
		bobjct.print();
		
		
		

	}

}
