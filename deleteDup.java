import java.util.*;
import java.util.Collection;
import java.util.stream.*;

public class deleteDup {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = P.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int ele = P.nextInt();
            al.add(ele);
        }
        List<Integer> sl = new ArrayList<>(n);
        sl = al.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Sorted List:" + sl);
    }
}
