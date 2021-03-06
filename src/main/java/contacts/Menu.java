package contacts;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    SearchPerson searchPerson = new SearchPerson();
    DisplayAllContacts displayAllContacts = new DisplayAllContacts();
    WriteContactToFile writeContactToFile = new WriteContactToFile();
    DataNewPersonFromUser dataNewPersonFromUser = new DataNewPersonFromUser();
    SearchingPhraseFromUser searchingPhraseFromUser = new SearchingPhraseFromUser();

    private String searchedPhrase = null;

    public void showAndRunMenu() throws IOException {
        System.out.println("M__E__N__U");
        System.out.println(); // break line
        System.out.println("1 - Show all contacts");
        System.out.println("2 - Add person");
        System.out.println("3 - Search");
        System.out.println("4 - Exit");

        int selectedItemFromMenu = scanner.nextInt();
        switch (selectedItemFromMenu) {
            case 1:
                displayAllContacts.showAllContacts();
                break;
            case 2:
                Person person = new Person();
                person = dataNewPersonFromUser.dataFromUser();
                writeContactToFile.addPersonToFile(person);
                break;
            case 3:
                showAndRunMenuSearch();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice");
                showAndRunMenu();
        }
    }

    public void showAndRunMenuSearch() {
        System.out.println(); // break line
        System.out.println("1 - Search by first name");
        System.out.println("2 - Search by last name");
        System.out.println("3 - Search by phone number");
        System.out.println("4 - Search by e-mail");

        int selectedItemFromSearchMenu = scanner.nextInt();
        switch (selectedItemFromSearchMenu) {
            case 1:
                searchedPhrase = searchingPhraseFromUser.searchedPhraseFromUser();
                searchPerson.searchByFirstName(searchedPhrase);
                break;
            case 2:
                searchedPhrase = searchingPhraseFromUser.searchedPhraseFromUser();
                searchPerson.searchByLastName(searchedPhrase);
                break;
            case 3:
                searchedPhrase = searchingPhraseFromUser.searchedPhraseFromUser();
                searchPerson.searchByPhoneNumber(searchedPhrase);
                break;
            case 4:
                searchedPhrase = searchingPhraseFromUser.searchedPhraseFromUser();
                searchPerson.searchByMail(searchedPhrase);
                break;
            default:
                System.out.println("Wrong choice\n");
                showAndRunMenuSearch();
        }
    }
}