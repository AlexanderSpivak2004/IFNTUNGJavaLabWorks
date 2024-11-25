package laboratory_work6;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // Task 1
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

        HashSet<Client> clientHashSet = new HashSet<>();

        clientHashSet.add(client1);
        clientHashSet.add(client2);
        clientHashSet.add(client3);

        LinkedHashMap<Integer, Client> clientLinkedHashMap = new LinkedHashMap<>();

        clientLinkedHashMap.put(client1.getId(), client1);
        clientLinkedHashMap.put(client2.getId(), client2);
        clientLinkedHashMap.put(client3.getId(), client3);

        // Task 2
        System.out.println("HashSet:");

        for (Client client : clientHashSet) {
            System.out.println(client);
        }

        System.out.println("LinkedHashMap:");

        for (Integer id : clientLinkedHashMap.keySet()) {
            System.out.println(clientLinkedHashMap.get(id));
        }

        // Task 3
        System.out.println();

        Client client4 = new Client("Eugene Prozak",
                "123412341234",
                "111122223334444",
                "Ivano-Frankivsk");
        Client client5 = new Client();

        clientHashSet.add(client4);
        clientHashSet.add(client5);

        for (Client client: clientHashSet) {
            if (client.getName() == "Natalia Martuniyk") {
                clientHashSet.remove(client);
            }
        }

        for (Client client: clientHashSet) {
            if (client.getName() == null) {
                client.setName("Stanislav Porohovskyi");
            }
        }

        System.out.println("Updated HashSet:");
        for (Client client: clientHashSet) {
            System.out.println(client);
        }

        clientLinkedHashMap.put(client4.getId(), client4);
        clientLinkedHashMap.put(client5.getId(), client5);

        clientLinkedHashMap.remove(1);

        for (Integer id : clientLinkedHashMap.keySet()) {
            if (clientLinkedHashMap.get(id).getAddress() == null) {
                clientLinkedHashMap.get(id).setAddress("Ukraine");
            }
        }

        System.out.println("Updated LinkedHashMap:");
        for (Integer id : clientLinkedHashMap.keySet()) {
            System.out.println(clientLinkedHashMap.get(id));
        }
    }
}
