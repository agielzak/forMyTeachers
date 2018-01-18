package contacts;

import java.util.Scanner;

public class SearchingPhraseFromUser {
    Scanner scanner = new Scanner(System.in);
    String searchingPhrase = null;

    public String searchedPhraseFromUser() {
        System.out.println("Who are you looking for?");
        searchingPhrase = scanner.nextLine();

        return searchingPhrase;
    }
}