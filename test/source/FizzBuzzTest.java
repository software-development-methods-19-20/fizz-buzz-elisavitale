import dssc.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public void check(String expected, int number) {
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(number));
    }

    @Test
    void threeIsFizz() {
        check("Fizz", 3);
    }

    @Test
    void fiveIsBuzz() {
        check("Buzz", 5);
    }

    @Test
    void eightIs8() {
        check("8", 8);
    }

    @Test
    void fifteenIsFizzBuzz() {
        check("FizzBuzz", 15);
    }

    @Test
    void sevenIsBang() {
        check("Bang", 7);
    }

    @Test
    void twentyOneIsFizzBang() {
        check("FizzBang", 21);
    }

    @Test
    void thirtyFiveIsBuzzBang() {
        check("BuzzBang", 35);
    }

    @Test
    void oneHundredFiveIsFizzBuzzBang() {
        check("FizzBuzzBang", 105);
    }
}
