package laboratory_work5.it.ip241k.spivak;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Set<Character> set1 = new Set<>(new Character[] {'a', 'b', 'c', 'd', 'e', 'f'});
        Set<Character> set2 = new Set<>(new Character[] {'d', 'e', 'f', 'g', 'h', 'i'});

        Operation operation = new Operation();

        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Union: " +
                Arrays.toString(operation.unionSets(set1.getSetArray(), set2.getSetArray())));
        System.out.println("Intersection: " +
                Arrays.toString(operation.intersectionSets(set1.getSetArray(), set2.getSetArray())));
        System.out.println("Difference: " +
                Arrays.toString(operation.differenceSets(set1.getSetArray(), set2.getSetArray())));
        System.out.println("Symetric difference: " +
                Arrays.toString(operation.symmetricDiffSets(set1.getSetArray(), set2.getSetArray())));
    }
}
