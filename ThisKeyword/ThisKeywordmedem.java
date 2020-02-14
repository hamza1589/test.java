package ThisKeyword;

public class ThisKeywordmedem {
	int a,b;
	void getValues (int a, int b) {
		this.a=a;
		
		this.b=b;
	}
	void printValues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeywordmedem th=new ThisKeywordmedem();
		th.getValues(10, 200);
		th.printValues();
		
		
	

	}

}
