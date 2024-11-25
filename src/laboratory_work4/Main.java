package laboratory_work4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alexander Spivak",
                CreditCardType.VISA,
                "1234-1234",
                "UA11112222333344445555",
                "Kyiv, Shevchenko Street, 12");

        Client client2 = new Client("Angelina Zayats",
                CreditCardType.MASTERCARD,
                "9876-5432-1012-3456",
                "UA5555666677778888999",
                "Lviv, Franko Street, 25");

        Client client3 = new Client();
        client3.setName("Natalia Martuniyk");
        client3.setCreditCardType(CreditCardType.AMERICAN_EXPRESS);
        client3.setCreditCardNumber("1111-2222-3333-4444");
        client3.setBankAccountNumber("UA 98 7654 3210 1234 5678 9000");
        client3.setAddress("Odessa, Deribasivska Street, 5");

        Client client4 = new Client("Angelina Zayats",
                CreditCardType.MASTERCARD,
                "9876-5432-1012-3456",
                "UA5555666677778888999",
                "Lviv, Franko Street, 25");

        // Dynamic dispatching example
        List<Client> clientsArrayList = new ArrayList<>();

        clientsArrayList.add(client1);
        clientsArrayList.add(client2);
        clientsArrayList.add(client3);
        clientsArrayList.add(client4);

        for (Client client : clientsArrayList) {
            System.out.println(client);
        }

        // Work based on HashSet
        HashSet<Client> clientsHashSet = new HashSet<>();

        clientsHashSet.add(client1);
        clientsHashSet.add(client2);
        clientsHashSet.add(client3);
        clientsHashSet.add(client4);

        for (Client client : clientsHashSet) {
            System.out.println(client);
        }

        // Anonymous inner class extending AbstractClient
        AbstractClient clientWithDiscount = new AbstractClient() {
            private double discountRate = 0.1;

            @Override
            public String printInfo() {
                return "Client with discount, Discount Rate: " + (discountRate * 100) + "%"
                        + ", Total clients: " + getInstanceCount();
            }

            @Override
            public String printInfoUpperCase() {
                return printInfo().toUpperCase();
            }
        };

        System.out.println(clientWithDiscount.printInfo());
        System.out.println(clientWithDiscount.printInfoUpperCase());

        // Task 9 Result
        System.out.println(client2.equals(client4));

        // Task 11 Result
        Client clonedClient = client1.clone();
        System.out.println("Cloned client: " + clonedClient);

        System.out.println("Are client1 and clonedClient equal? " + client1.equals(clonedClient));

        // Task 12 Result
        System.out.println("Comparison result between client1 and client2: " + client1.compareTo(client2));
    }
}
