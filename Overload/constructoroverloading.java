package Overload;

public class constructoroverloading {
	constructoroverloading(int a, int b){
		System.out.println(a+b);
	}
	constructoroverloading(int a, double b){
		System.out.println(a+b);
	}
	
	
	constructoroverloading(double a, int b){
	System.out.println(a+b);}
	

	
	constructoroverloading(int a,int b,int c){
	System.out.println(a+b+c);}
	
	
	

	public static void main(String[] args) {
		constructoroverloading mc=new constructoroverloading(100,200,500);
		
		
		
		// TODO Auto-generated method stub

	}

}
