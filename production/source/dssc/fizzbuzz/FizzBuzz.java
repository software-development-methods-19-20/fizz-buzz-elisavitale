package dssc.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (isMultipleOfKey(number, 3) && isMultipleOfKey(number, 5))
            return fizzBuzzRules.get(3) + fizzBuzzRules.get(5);
        else if (isMultipleOfKey(number, 3))
            return fizzBuzzRules.get(3);
        else if (isMultipleOfKey(number, 5))
            return fizzBuzzRules.get(5);
        else
            return Integer.toString(number);
    }

    private static boolean isMultipleOfKey(int number, int key) {
        return number % key == 0;
    }

    private static HashMap<Integer, String> fizzBuzzRules = putRules();

    private static HashMap<Integer, String> putRules() {
        HashMap<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");
        return rules;
    }
}
