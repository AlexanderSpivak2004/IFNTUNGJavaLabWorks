package laboratory_work8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String mostFrequentSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(sentence);

        if (matcher.matches()) {
            HashMap<Character, Integer> charactersFrequencyHashMap = new HashMap<>();

            for (Character character : sentence.toCharArray()) {
                if (character.equals(' ')) {
                    continue;
                }

                charactersFrequencyHashMap.put(character,
                        charactersFrequencyHashMap.getOrDefault(character, 0) + 1);
            }

            int mostFrequentValue = 0;

            for (Character key : charactersFrequencyHashMap.keySet()) {
                if (mostFrequentValue < charactersFrequencyHashMap.get(key)) {
                    mostFrequentValue = charactersFrequencyHashMap.get(key);
                }
            }

            System.out.println("Most frequent symbol(s) : ");
            for (Character key : charactersFrequencyHashMap.keySet()) {
                if (charactersFrequencyHashMap.get(key) == mostFrequentValue) {
                    return "Symbol : " + key + ". Count: " + charactersFrequencyHashMap.get(key);
                }
            }
        }

        return "Your sentence is not appropriate to the regular expression";
    }

    public static boolean passwordValidator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_]){8,32}$");
        Matcher matcher = pattern.matcher(password);

        boolean isHasLowerCase = false, isHasUpperCase = false, isHasDigit = false;

        for (Character character : password.toCharArray()) {
            if (Character.isLowerCase(character)) {
                isHasLowerCase = true;
            } else if (Character.isUpperCase(character)) {
                isHasUpperCase = true;
            } else if (Character.isDigit(character)) {
                isHasDigit = true;
            }
        }

        return (matcher.matches() && isHasLowerCase && isHasUpperCase && isHasDigit);
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentSymbol());
        System.out.println(passwordValidator());
    }
}
