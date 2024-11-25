package laboratory_work3;

import java.util.regex.*;

public class Client {
    /* Створити клас «Клієнт», що містить інформацію
     про клієнта банку. Клас повинен включати змінні із назвами:
     - ім’я клієнта;
     - номер кредитної картки;
     - номер банківського рахунку;
     - адреса проживання. */

    private static int count = 0;
    private int id;
    private String name;
    private String creditCardNumber;
    private String bankAccountNumber;
    private String address;

    public Client() {
        count++;
        this.id = count;
    }

    public Client(String name, String creditCardNumber, String bankAccountNumber, String address) {
        this();
        setName(name);
        setCreditCardNumber(creditCardNumber);
        setBankAccountNumber(bankAccountNumber);
        setAddress(address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        Pattern pattern = Pattern.compile("^(\\d{4}[- ]){3}\\d{4}$");
        Matcher matcher = pattern.matcher(creditCardNumber);

        if (matcher.matches()) {
            this.creditCardNumber = creditCardNumber;
        }
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        Pattern pattern = Pattern.compile("^[A-Z]{2}[- ]?\\d{2}[- ]?(\\d{4}[- ]?){5}$");
        Matcher matcher = pattern.matcher(bankAccountNumber);

        if (matcher.matches()) {
            this.bankAccountNumber = bankAccountNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String printInfo() {
        return "Client " + name + ", Credit Card Number: " + creditCardNumber
                + ", Bank Account Number: " + bankAccountNumber + ", Address: " + address;
    }

    public String printInfoUpperCase() {
        return printInfo().toUpperCase();
    }
}
