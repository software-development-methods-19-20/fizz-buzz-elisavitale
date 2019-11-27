package dssc.fizzbuzz;

public class FizzBuzz {

    private static ConversionRules rules = new ConversionRules();

    public static String fizzBuzz(int number) {
        if (isMultipleOfAnyKey(number))
            return writeFizzBuzzString(number);
        else
            return Integer.toString(number);
    }

    private static boolean isMultipleOfAnyKey(int number) {
        boolean isMultiple = false;
        for (int key : rules.getAllKeys()) {
            isMultiple = isMultiple || isMultipleOfKey(number, key);
        }
        return isMultiple;
    }

    private static boolean isMultipleOfKey(int number, int key) {
        return number % key == 0;
    }

    private static String writeFizzBuzzString(int number) {
        StringBuilder fizzBuzzString = new StringBuilder();
        for (int key : rules.getAllKeys())
            if (isMultipleOfKey(number, key))
                updateStringValue(fizzBuzzString, key);
        return fizzBuzzString.toString();
    }

    private static void updateStringValue(StringBuilder fizzBuzzString, int key) {
        fizzBuzzString.append(rules.getValue(key));
    }
}
