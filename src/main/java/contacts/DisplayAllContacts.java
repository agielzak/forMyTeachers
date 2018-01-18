package contacts;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisplayAllContacts {
    List<Person> allContacts = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    public final String PATH_NAME_TO_JSON_FILE = "dataBaseJson.json";
    File file = new File(PATH_NAME_TO_JSON_FILE);

    public void showAllContacts() {

        try {
            allContacts = objectMapper.readValue(file, new TypeReference<List<Person>>() {
            });

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person person : allContacts) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.geteMail() + " " +
                    person.getPhoneNumber());
        }
    }
}
