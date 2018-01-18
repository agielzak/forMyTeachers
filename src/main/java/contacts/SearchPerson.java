package contacts;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPerson {
    List<Person> allContacts = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    public final String PATH_NAME_TO_JSON_FILE = "dataBaseJson.json";
    File file = new File(PATH_NAME_TO_JSON_FILE);

    public void searchByFirstName(String searchedPhrase) {

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

        allContacts.stream().
                filter(s -> s.getFirstName().toString().toUpperCase().contains(searchedPhrase.toUpperCase()))
                .forEach(System.out::println);
    }

    public void searchByLastName(String searchedPhrase) {

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

        allContacts.stream().
                filter(s -> s.getLastName().toString().toUpperCase().contains(searchedPhrase.toUpperCase()))
                .forEach(System.out::println);
    }

    public void searchByPhoneNumber(String searchedPhrase) {

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

        allContacts.stream().
                filter(s -> s.getPhoneNumber().toString().toUpperCase().contains(searchedPhrase.toUpperCase()))
                .forEach(System.out::println);
    }

    public void searchByMail(String searchedPhrase) {

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

        allContacts.stream().
                filter(s -> s.geteMail().toString().toUpperCase().contains(searchedPhrase.toUpperCase()))
                .forEach(System.out::println);
    }
}