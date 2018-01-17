package contacts;

import java.io.IOException;

public class ContactsMain {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        WriteContactToFile writeContactToFile = new WriteContactToFile();

        writeContactToFile.addPersonToFile(new Person("Adrian", "Giełzak", "555555555", "a@b.pl"));
        writeContactToFile.addPersonToFile(new Person("Edyta", "Ratajczak", "333333333", "c@d.pl"));
        writeContactToFile.addPersonToFile(new Person("Zenon", "Martyniu", "111111111", "e@f.pl"));
        writeContactToFile.addPersonToFile(new Person("Sławomir", "Sławomir", "777777777", "g@h.pl"));
        writeContactToFile.addPersonToFile(new Person("Bogdan", "Stemplewski", "999999999", "i@j.pl"));
        writeContactToFile.addPersonToFile(new Person("Andrzej", "Maruda", "123456789", "k@l.pl"));

        menu.showAndRunMenu();


    }
}