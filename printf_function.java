import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1,x);
//-15s is used to create 15 spaces to the right of  a string
//03d is used to assign a 0 to the left of number if it's length is less than 3 
              //break;
            }
      }
}
