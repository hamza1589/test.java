package array;

public class arraysclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=1,2,3,3,4,4,5,5,6,6,7,7;
		//arrays is collections of elements of the same data type
	/*	1-declare array
		2-insert value in to array
		3-find size of an array
		4-read an value from an array*/
		int a[]=new int[5]; //Declare array with size 5
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//System.out.println("lenght of an array:" +a.length);//print length/size of array
		//System.out.println(a[2]);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
