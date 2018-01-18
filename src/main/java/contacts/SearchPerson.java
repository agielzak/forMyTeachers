package contacts;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SearchPerson {

    ObjectMapper objectMapper = new ObjectMapper();

    public void searchByFirstName() {
        System.out.println("Searching by first name");
    }

    public void searchByLastName() {
        System.out.println("Searching by last name");
    }

    public void searchByPhoneNumber() {
        System.out.println("Searching by phone number");
    }

    public void searchByMail() {
        System.out.println("Searching by e-mail");
    }

}