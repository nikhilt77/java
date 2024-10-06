import java.util.*;

public class Iterator {

    static void removeEven(Collection<Integer> c) {
        java.util.Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
    }

    static void removeOdd(Collection<Integer> c) {
        java.util.Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 != 0) {
                it.remove();
            }
        }
    }

    static Integer findMax(Collection<Integer> c) {
        return c.stream().max(Integer::compareTo).orElse(null);
    }

    static Integer findMin(Collection<Integer> c) {
        return c.stream().min(Integer::compareTo).orElse(null);
    }

    static void sortC(List<Integer> c) {
        Collections.sort(c);
    }

    static void clearC(Collection<Integer> c) {
        c.clear();
    }

    static boolean searchElement(Collection<Integer> c, int element) {
        return c.contains(element);
    }

    static void displayCollection(Collection<Integer> c) {
        if (c.isEmpty()) {
            System.out.println("The collection is empty.");
        } else {
            System.out.println("Collection elements: " + c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> collection = new LinkedList<>(); // Using LinkedList for demonstration
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add elements to the collection");
            System.out.println("2. Remove even numbers");
            System.out.println("3. Remove odd numbers");
            System.out.println("4. Display collection");
            System.out.println("5. Find maximum value");
            System.out.println("6. Find minimum value");
            System.out.println("7. Sort collection");
            System.out.println("8. Clear collection");
            System.out.println("9. Search for an element");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements to add: ");
                    int n = scanner.nextInt();
                    System.out.print("Enter elements: ");
                    for (int i = 0; i < n; i++) {
                        int element = scanner.nextInt();
                        collection.add(element);
                    }
                    break;
                case 2:
                    removeEven(collection);
                    System.out.println("Even numbers removed.");
                    break;
                case 3:
                    removeOdd(collection);
                    System.out.println("Odd numbers removed.");
                    break;
                case 4:
                    displayCollection(collection);
                    break;
                case 5:
                    Integer max = findMax(collection);
                    if (max != null) {
                        System.out.println("Maximum value: " + max);
                    } else {
                        System.out.println("The collection is empty.");
                    }
                    break;
                case 6:
                    Integer min = findMin(collection);
                    if (min != null) {
                        System.out.println("Minimum value: " + min);
                    } else {
                        System.out.println("The collection is empty.");
                    }
                    break;
                case 7:
                    List<Integer> sortedList = new ArrayList<>(collection);
                    sortC(sortedList);
                    System.out.println("Sorted collection: " + sortedList);
                    break;
                case 8:
                    clearC(collection);
                    System.out.println("Collection cleared.");
                    break;
                case 9:
                    System.out.print("Enter element to search for: ");
                    int elementToSearch = scanner.nextInt();
                    if (searchElement(collection, elementToSearch)) {
                        System.out.println(
                            "Element " +
                            elementToSearch +
                            " found in the collection."
                        );
                    } else {
                        System.out.println(
                            "Element " +
                            elementToSearch +
                            " not found in the collection."
                        );
                    }
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10);

        scanner.close();
    }
}
