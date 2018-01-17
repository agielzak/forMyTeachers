package contacts;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContactToFile {

    public final String PATH_NAME_TO_JSON_FILE = "dataBaseJson.json";

//    public ArrayList<Person> dataBaseFromContacts = new ArrayList<>();
//
//    public void addPersonToList(Person newPerson) {
//        dataBaseFromContacts.add(newPerson);
//    }

    public void addPersonToFile(Person person) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileWriter file = new FileWriter(PATH_NAME_TO_JSON_FILE, true);

        try {
           // objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); // --> Help from https://stackoverflow.com/questions/8367312/serializing-with-jackson-json-getting-no-serializer-found

            objectMapper.writeValue(file, person);
            System.out.println(objectMapper.writeValueAsString(person));
//
//            String jsonStringObjekt = objectMapper.writeValueAsString(person);
//            System.out.println(jsonStringObjekt);
//
//            jsonStringObjekt = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
//            System.out.println(jsonStringObjekt);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}