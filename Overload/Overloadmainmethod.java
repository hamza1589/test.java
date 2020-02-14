package Overload;

public class Overloadmainmethod {
	public void main(int x) {
		System.out.println(x);
		
	}
	public void main(int x, int y) {
		System.out.println(x+y);
		
	}
	
	

	public static void main(String[] args) {
		Overloadmainmethod mc=new Overloadmainmethod();
		mc.main(100);
		mc.main(100, 200);
		// TODO Auto-generated method stub
		

	}

}
