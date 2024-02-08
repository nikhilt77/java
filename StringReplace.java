import java.util.*;
public class StringReplace{
    public static void main(String args[]){
        Scanner P=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=P.nextLine();
        System.out.println("Enter string to replace:");
        String str1=P.nextLine();
        System.out.println("Enter String to replace with:");
        String str2=P.nextLine();
        StringTokenizer token =new StringTokenizer(str," ");
        while(token.hasMoreTokens()){
            String temp=token.nextToken();
            for(int i=0;i<temp.length();i++){
                for(int j=i+1;j<temp.length();j++){
                    if(temp.substring(i,j+1).equalsIgnoreCase(str2)||temp.equalsIgnoreCase(str2));{
                        temp=temp.replace(str1,str2);
                    }
                }
            }
            System.out.print(temp+" ");
        }
    }
}
