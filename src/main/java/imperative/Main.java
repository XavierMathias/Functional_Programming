package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("David", Gender.MALE),
                new Person("Melina", Gender.FEMALE),
                new Person("Esther", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE)
        );

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
