package dssc.fizzbuzz;

import java.util.HashMap;
import java.util.Set;

public class ConversionRules {

    private HashMap<Integer, String> rules;

    ConversionRules() {
        this.rules = putRules();
    }

    private static HashMap<Integer, String> putRules() {
        HashMap<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");
        rules.put(7, "Bang");
        return rules;
    }

    String getValue(int key) {
        return rules.get(key);
    }

    Set<Integer> getAllKeys() {
        return rules.keySet();
    }
}
