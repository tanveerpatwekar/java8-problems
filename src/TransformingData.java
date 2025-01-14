
import helper.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TransformingData {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Virat", 33));
        list.add(new Person("Rohit", 34));
        list.add(new Person("Dhoni", 37));
        list.add(new Person("Bumrah", 30));
        list.add(new Person("Shami", 35));
        list.add(new Person("Jaiswal", 27));

        Set<String> nameSet = list.stream().filter(person -> person.getAge() > 30).map(Person::getName).map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(nameSet);
    }
}

    /*Transforming Data
    Use the Stream.map() function to transform a list of objects into a new list of a different type and perform multiple transformations in a pipeline.

        Requirements:

        Define a Person class with fields name and age.
        Create a list of Person objects.
        Convert the list of Person objects into a list of String objects containing only the names of people who are older than 30.
        Chain multiple map() operations to:
        First, extract the names of people who are over 30.
        Then, transform the names to uppercase.
        Use Collectors.toList() to collect the final results into a list.
        Ensure that the final list of names contains unique names using Collectors.toSet().*/