package dssc.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (isMultipleOfKey(number, 3) && isMultipleOfKey(number, 5))
            return "Fizz" + "Buzz";
        else if (isMultipleOfKey(number, 3))
            return "Fizz";
        else if (isMultipleOfKey(number, 5))
            return "Buzz";
        else
            return Integer.toString(number);
    }

    public static boolean isMultipleOfKey(int number, int key) {
        return number % key == 0;
    }
}
