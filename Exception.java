import java.util.*;
import java.io.*;
class Exception{
	public static void divide(int a,int b) throws ArithmeticException{
		if(b==0) {
		throw new ArithmeticException("Division with 0");
	}
		int c=a/b;
		System.out.println("Result:"+c);
}


	public static void main(String[] args) {
		int sum=0;
		Scanner P=new Scanner(System.in);
		//OP o=new OP();
		System.out.println("Enter numbers to divide:");
		int a=P.nextInt();
		int b=P.nextInt();
		
		int A[]=new int[5];
		System.out.println("Enter Array:");
		try {
			for(int i=0;i<5;i++) {
				A[i]=P.nextInt();
			}
			for(int i=0;i<5;i++) {
				sum+=A[i];
			}
			System.out.println("Sum is"+sum);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of bounds");
		}
		divide(a,b);

	}

}
