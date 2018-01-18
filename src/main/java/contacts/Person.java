package contacts;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMail;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getPhoneNumber() + " " + geteMail();
    }
}