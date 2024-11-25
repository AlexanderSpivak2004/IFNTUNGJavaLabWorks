package laboratory_work7;

import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    PhoneBook() {
        count++;
        this.id = count;
    }

    PhoneBook(String name, String surname, String phoneNumber, Address address) {
        this();
        setName(name);
        setSurname(surname);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    private static int count = 0;
    private int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private Address address;
    private static List<PhoneBook> contactsList = new LinkedList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address {
        Address() {}

        Address(String city, String street, String houseNumber) {
            setCity(city);
            setStreet(street);
            setHouseNumber(houseNumber);
        }

        private String city;
        private String street;
        private String houseNumber;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", houseNumber='" + houseNumber + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }

    public static void addNewContact(PhoneBook contact) {
        contactsList.add(contact);
    }

    public static void removeExistingContact(int id) {
        PhoneBook contactToRemove = null;

        for (PhoneBook contact : contactsList) {
            if (contact.id == id) {
                contactToRemove = contact;
            }
        }

        contactsList.remove(contactToRemove);
    }

    public static void printContactsList() {
        for (PhoneBook contact : contactsList) {
            System.out.println(contact);
        }
    }

    public static String searchPhoneNumberByNameAndSurname(String name, String surname) {
        for (PhoneBook contact : contactsList) {
            if (contact.name.equals(name) && contact.surname.equals(surname)) {
                return name + " " + surname + "'s phoneNumber: " + contact.getPhoneNumber();
            }
        }

        return "There are no contacts with such name and surname";
    }
}
