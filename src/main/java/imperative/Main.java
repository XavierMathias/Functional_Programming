package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("David", Gender.MALE),
                new Person("Melina", Gender.FEMALE),
                new Person("Esther", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE)
        );

        System.out.println("//Imperative Approach\n");
        //Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person p : people){
            if(Gender.FEMALE.equals(p.gender)){
                females.add(p);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        System.out.println("//Declarative Approach");
        //Declarative Approach
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println );

        List<Person> females2 = people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
