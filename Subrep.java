import java.util.*;

class Subrep {
    private static boolean isPalindrome(int s, int e, char str[]) {
        while (s < e) {
            if (str[s] != str[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        System.out.print("Enter string:");
        String string = P.nextLine();
        int s = 0;
        char str[] = string.toCharArray();

        for (int i = 0; i <= str.length; i++) {
            if (i == str.length || str[i] == ' ') {
                if (isPalindrome(s, i - 1, str)) {
                    for (int j = s; j < i; j++) {
                        str[j] = '*';
                    }
                }
                s = i + 1;
            }
        }
        System.out.println(str);
    }
}
