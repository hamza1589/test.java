package inheritance;
class A {
	int a;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b;
	void print() {
		System.out.println(b);
	}
}
class C extends B{
	int c;
	void show() {
	System.out.println(c);
	}

	
	
}


public class multipleinheritance {

	public static void main(String[] args) {
		C obj=new C();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.display();
		obj.print();
		obj.show();
		

	}

}
