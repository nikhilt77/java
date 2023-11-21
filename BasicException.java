import java.util.*;

public class BasicException {
	public static void perf(int a,int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("Cannot divide");
		}
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		int b=0,a=10;
		int A[]=new int[5];
		try {
			
			perf(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println("Error Detected");
		}
			
		try {
			A[10]=8;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Array out of bounds");
		}
	}

}
