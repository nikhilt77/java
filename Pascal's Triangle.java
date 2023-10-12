
import java.util.*;
public class Pascals_triangle {

	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		System.out.print("Ente"
				+ "r Limit: ");
		int n=P.nextInt();
		int A[]=new int[n];
		A[0]=1;
		System.out.print(A[0]);
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>0;j--) {
				A[j]=A[j]+A[j-1];
			}
			
		
		for(int k=0;k<=i;k++) {
			System.out.print(A[k]+" ");
		}
		System.out.println();
	}
	}
