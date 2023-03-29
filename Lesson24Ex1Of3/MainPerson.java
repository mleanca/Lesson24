package Lesson24Ex1Of3;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[] args) throws Exception {

        List<Person> personArrayList = new ArrayList<>();

        try {
            personArrayList.add(new Person("Ion", "Ciobanu", 24));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            personArrayList.add(new Person("", "Sandul", 150));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            personArrayList.add(new Person("Maxim", "", 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            personArrayList.add(new Person("Doina", "Ionescu", 160)); //Age must be 0 to 150
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (Person person : personArrayList) {
            System.out.println(person);
        }
        //First name must not be null or empty
        //Last name must not be null or empty
        //Age must be 0 to 150
        //Person{firstName='Ion', lastName='Ciobanu', age=24}

    }
}


