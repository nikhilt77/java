import java.io.*;
import java.util.*;

class WildParent {

    void print() {
        System.out.println("Parent Class\n");
    }
}

class WildChild extends WildParent {

    void print() {
        System.out.println("Child Class\n");
    }
}

class WildGrandChild extends WildParent {

    void print() {
        System.out.println("GrandChild Class\n");
    }
}

class Wild {

    static void printS(List<? extends WildParent> al) {
        for (WildParent w : al) {
            w.print();
        }
    }

    public static void main(String args[]) {
        ArrayList<WildChild> al2 = new ArrayList<WildChild>();
        al2.add(new WildChild());
        ArrayList<WildGrandChild> al3 = new ArrayList<WildGrandChild>();
        al3.add(new WildGrandChild());
        printS(al2);
        printS(al3);
    }
}
