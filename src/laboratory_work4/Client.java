package laboratory_work4;

import java.util.Objects;
import java.util.regex.*;

public class Client extends AbstractClient implements IValidator, Cloneable, Comparable<Client> {
    private String name;
    private CreditCardType creditCardType;
    private String creditCardNumber;
    private String bankAccountNumber;
    private String address;

    public Client() {}

    public Client(String name, CreditCardType creditCardType, String creditCardNumber, String bankAccountNumber, String address) {
        this();
        setName(name);
        setCreditCardType(creditCardType);
        setCreditCardNumber(creditCardNumber);
        setBankAccountNumber(bankAccountNumber);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        if (validateCreditCardNumber(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        if (validateBankAccountNumber(bankAccountNumber)) {
            this.bankAccountNumber = bankAccountNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String printInfo() {
        return "Client " + name +  ", Credit Card Type: " + creditCardType + ", Credit Card Number: " +
                creditCardNumber + ", Bank Account Number: " + bankAccountNumber + ", Address: " + address;
    }

    @Override
    public String printInfoUpperCase() {
        return printInfo().toUpperCase();
    }

    @Override
    public boolean validateCreditCardNumber(String creditCardNumber) {
        Pattern pattern = Pattern.compile("^(\\d{4}[- ]){3}\\d{4}$");
        Matcher matcher = pattern.matcher(creditCardNumber);

        return matcher.matches();
    }

    @Override
    public boolean validateBankAccountNumber(String bankAccountNumber) {
        Pattern pattern = Pattern.compile("^[A-Z]{2}[- ]?\\d{2}[- ]?(\\d{4}[- ]?){5}$");
        Matcher matcher = pattern.matcher(bankAccountNumber);

        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", creditCardType='" + creditCardType + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        return (Objects.equals(getId(), client.getId()) &&
                Objects.equals(name, client.name) &&
                Objects.equals(creditCardType, client.creditCardType) &&
                Objects.equals(creditCardNumber, client.creditCardNumber) &&
                Objects.equals(bankAccountNumber, client.bankAccountNumber) &&
                Objects.equals(address, client.address));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name, creditCardType, creditCardNumber, bankAccountNumber, address);
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Client other) {
        return this.name.compareTo(other.name);
    }
}