package laboratory_work3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alexander Spivak",
                "1234-1234",
                "UA11112222333344445555",
                "Kyiv, Shevchenko Street, 12");

        Client client2 = new Client("Angelina Zayats",
                "9876-5432-1012-3456",
                "UA5555666677778888999",
                "Lviv, Franko Street, 25");

        Client client3 = new Client();
        client3.setName("Natalia Martuniyk");
        client3.setCreditCardNumber("1111-2222-3333-4444");
        client3.setBankAccountNumber("UA 98 7654 3210 1234 5678 9000");
        client3.setAddress("Odessa, Deribasivska Street, 5");

        System.out.println(client1.printInfo());
        System.out.println(client1.printInfoUpperCase());
        System.out.println(client2.printInfo());
        System.out.println(client2.printInfoUpperCase());
        System.out.println(client3.printInfo());
        System.out.println(client3.printInfoUpperCase());

        ArrayList<Client> clients = new ArrayList<>();

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        for (Client client : clients) {
            System.out.println(client.printInfo());
        }
    }
}
