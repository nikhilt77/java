import java.util.*;
public class Calendarer { 
    public static void main(String args[]){
        int year, month, day;    
        java.util.Calendar current;
        current = java.util.Calendar.getInstance();

        year = current.get(java.util.Calendar.YEAR);
        month = current.get(java.util.Calendar.MONTH); 
        day = current.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Current Year: " + year);
        System.out.println("Current Month: " + (month + 1));
        System.out.println("Current Day: " + day);
    }
}
