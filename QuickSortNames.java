import java.util.Scanner;

public class QuickSortNames {

    static void quickSort(String[] names, int low, int high) {
        if (low < high) {
            int pi = partition(names, low, high);
            quickSort(names, low, pi - 1);
            quickSort(names, pi + 1, high);
        }
    }

    static int partition(String[] names, int low, int high) {
        String pivot = names[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (names[j].compareTo(pivot) < 0) {
                i++;
                String temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }
        String temp = names[i + 1];
        names[i + 1] = names[high];
        names[high] = temp;
        return i + 1;
    }

    static void printArray(String[] names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String names[] = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        quickSort(names, 0, n - 1);
        System.out.println("Sorted names: ");
        printArray(names);
    }
}
