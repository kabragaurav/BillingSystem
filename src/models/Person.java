package models;

import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public abstract class Person {
    private String name;
    private List<String> contactNumbers;
    private List<String> emails;

    public Person() {
    }

    public Person(String name, List<String> contactNumbers, List<String> emails) {
        this.name = name;
        this.contactNumbers = contactNumbers;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
