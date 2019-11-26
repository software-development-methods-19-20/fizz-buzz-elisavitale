package dssc.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (number % 15 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(number);
    }
}
