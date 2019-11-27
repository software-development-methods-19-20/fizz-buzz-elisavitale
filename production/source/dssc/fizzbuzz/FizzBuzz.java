package dssc.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (isMultipleOfAnyKey(number))
            return writeFizzBuzzString(number);
        else
            return Integer.toString(number);
    }

    private static boolean isMultipleOfAnyKey(int number) {
        boolean isMultiple = false;
        for (int key : fizzBuzzRules.keySet()) {
            isMultiple = isMultiple || isMultipleOfKey(number, key);
        }
        return isMultiple;
    }

    private static boolean isMultipleOfKey(int number, int key) {
        return number % key == 0;
    }

    private static String writeFizzBuzzString(int number) {
        StringBuilder fbstring = new StringBuilder();
        for (int key : fizzBuzzRules.keySet())
            if (isMultipleOfKey(number, key))
                updateStringValue(fbstring, key);
        return fbstring.toString();
    }

    private static void updateStringValue(StringBuilder fbstring, int key) {
        fbstring.append(fizzBuzzRules.get(key));
    }

    private static HashMap<Integer, String> fizzBuzzRules = putRules();

    private static HashMap<Integer, String> putRules() {
        HashMap<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");
        return rules;
    }
}
