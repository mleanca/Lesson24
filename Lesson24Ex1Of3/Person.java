package Lesson24Ex1Of3;

import javax.naming.InvalidNameException;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws Exception {

        //InvalidNameException va fi aruncată atunci când firstName sau lastName au primit valori nule sau String-uri goale,
        if (firstName == null || firstName == "") {
            throw new InvalidNameException("First name must not be null or empty");
        } else {
            this.firstName = firstName;
        }


        if (lastName == null || lastName == "") {
            throw new InvalidNameException("Last name must not be null or empty");
        } else {
            this.lastName = lastName;
        }

        //InvalidRangeException va fi aruncată când vârsta primită ca argument la constructor este mai mică ca 0 sau mai mare ca 150.
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be 0 to 150");
            //InvalidAgeException is not possible?
            //IllegalArgumentException researched in stack overflow website
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
