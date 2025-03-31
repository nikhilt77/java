import java.util.*;
import java.util.stream.*;

class Person {

    private String name;
    private int age;
    private String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")" + "from " + city;
    }
}

public class peopleCity {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        ArrayList<Person> al = new ArrayList<>();
        int n;
        System.out.println("Enter size:");
        n = P.nextInt();
        P.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name:");
            String name = P.nextLine();

            System.out.println("Enter Age:");
            int age = P.nextInt();
            P.nextLine();

            System.out.println("Enter City:");
            String city = P.nextLine();

            al.add(new Person(name, age, city));
        }
        Map<String, List<Person>> cityGroup = al
            .stream()
            .collect(Collectors.groupingBy(Person::getCity));
        cityGroup.forEach((city, personList) ->
            personList.sort(Comparator.comparingInt(Person::getAge))
        );
        System.out.println("=== Grouped By City ===");
        cityGroup.forEach((city, personList) -> {
            System.out.println("City:" + city);
            personList.forEach(x -> System.out.println(" " + x));
        });
    }
}
