import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HomeWork {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, Person.GENDER_MALE, "one", 20, "BJ"));
        persons.add(new Person(2, Person.GENDER_MALE, "two", 20, "SH"));
        persons.add(new Person(3, Person.GENDER_FEMALE, "three", 30, "BJ"));
        persons.add(new Person(4, Person.GENDER_FEMALE, "four", 30, "BJ"));
        persons.add(new Person(5, Person.GENDER_MALE, "five", 30, "SH"));
        persons.add(new Person(6, Person.GENDER_FEMALE, "six", 40, "BJ"));

        Map<String, List<Person>> resGroup = persons.stream().collect(Collectors.groupingBy(p -> p.getCityName()));
        System.out.println(resGroup);

        Map<Boolean, List<Person>> resPartition =
                persons.stream().collect(Collectors.partitioningBy(p -> p.getGender() == Person.GENDER_MALE));
        System.out.println(resPartition);
    }
}
