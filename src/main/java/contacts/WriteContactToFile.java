package contacts;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteContactToFile {
    public final String PATH_NAME_TO_JSON_FILE = "dataBaseJson.json";
    File file = new File(PATH_NAME_TO_JSON_FILE);
    ObjectMapper objectMapper = new ObjectMapper();
    private List<Person> dataBaseFromContacts = new ArrayList<>();

    public List<Person> addPersonToList(Person newPerson) {
        System.out.println("dataBaseFromContacts.isEmpty() = " + dataBaseFromContacts.isEmpty());
        System.out.println("dataBaseFromContacts.size() = " + dataBaseFromContacts.size());

        try {
            dataBaseFromContacts = objectMapper.readValue(file, new TypeReference<List<Person>>() {
            });
            dataBaseFromContacts.add(newPerson);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataBaseFromContacts;
    }

    public void addPersonToFile(Person person) throws IOException {

        try {
            // objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); // --> Help from https://stackoverflow.com/questions/8367312/serializing-with-jackson-json-getting-no-serializer-found
            addPersonToList(person);
            objectMapper.writeValue(file, dataBaseFromContacts);

            System.out.println(objectMapper.writeValueAsString(person));
            System.out.println("Added contact. \nAll contacts: " + dataBaseFromContacts.size());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getDataBaseFromContacts() {
        return dataBaseFromContacts;
    }
}