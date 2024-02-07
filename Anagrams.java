import java.util.*;

public class Anagrams {
    public static boolean isAnagram(String s1,String s2){
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        if(s1.length()!=s2.length())
        return false;
        
        for(int i=0;i<s1.length();i++){
                char c1=s1.charAt(i);
                freq1[c1]++;
                char c2=s2.charAt(i);
                freq2[c2]++;
        }
        
            for(int i=0;i<256;i++){
                if(freq1[i]!=freq2[i]){
                return false;
                }

            }
            return true;

 }
    
    public static void main(String args[]){
        Scanner P=new Scanner(System.in);
        System.out.println("enter string 1:");
        String s1=P.nextLine();
        System.out.println("Enter string 2:");
        String s2=P.nextLine();
        if(isAnagram(s1,s2)){
            System.out.println("Anagram");

        }
        else{
            System.out.println("Not anagram");
        }
    }
}
