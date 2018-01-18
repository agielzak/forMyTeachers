package contacts;

import java.util.Scanner;

public class DataNewPersonFromUser {
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();

    public Person dataFromUser() {
        System.out.println("Enter first name: ");
        person.setFirstName(scanner.nextLine());
        System.out.println("Enter last name: ");
        person.setLastName(scanner.nextLine());
        System.out.println("Enter phone number: ");
        person.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter e-mail: ");
        person.seteMail(scanner.nextLine());

        return person;
    }
}