package Training;

public class Training1 {
	 int length=5;
	 int width=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training1 hamza=new Training1();
		hamza.area();
		hamza.circle();
		
		
		

	}
	public void area(){
		int length=8;
		int area=length*width;
		System.out.println(area);
		
	}
	public void circle(){
		int circle=this.length+width;
		System.out.println(circle);
	}

}
