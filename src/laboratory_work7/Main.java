package laboratory_work7;

import laboratory_work9.Methods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        PhoneBook contact1 = new PhoneBook("Alexander",
                "Spivak",
                "+380665684618",
                new PhoneBook.Address(
                        "Ivano-Frankivsk",
                        "First",
                        "1"));

        PhoneBook contact2 = new PhoneBook("Angelina",
                "Zayats",
                "+380123456789",
                new PhoneBook.Address(
                        "Ivano-Frankivsk",
                        "Second",
                        "2"));

        PhoneBook contact3 = new PhoneBook("Natalia",
                "Martuniyk",
                "+380987654321",
                new PhoneBook.Address(
                        "Kyiv",
                        "Third",
                        "3"));

        PhoneBook contact4 = new PhoneBook("Eugene",
                "Prozak",
                "+380111159999",
                new PhoneBook.Address(
                        "Odessa",
                        "Forth",
                        "4"));

        System.out.println("Phone book (before deleted contacts):");

        PhoneBook.addNewContact(contact1);
        PhoneBook.addNewContact(contact2);
        PhoneBook.addNewContact(contact3);
        PhoneBook.addNewContact(contact4);

        PhoneBook.printContactsList();

        System.out.println("Phone book (after deleted contacts):");

        PhoneBook.removeExistingContact(1);

        PhoneBook.printContactsList();

        System.out.println(PhoneBook.searchPhoneNumberByNameAndSurname("Unknown", "Unknown"));
        System.out.println(PhoneBook.searchPhoneNumberByNameAndSurname("Angelina", "Zayats"));
    }
}
