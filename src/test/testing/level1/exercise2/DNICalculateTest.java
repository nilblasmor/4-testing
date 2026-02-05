package testing.level1.exercise2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class DNICalculateTest {

    public DNICalculate dniC = new DNICalculate();

    @Test
    void testLetterIsCorrect() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12345678);
        numbers.add(87654321);
        numbers.add(11111111);
        numbers.add(22222222);
        numbers.add(33333333);
        numbers.add(44444444);
        numbers.add(55555555);
        numbers.add(66666666);
        numbers.add(77777777);
        numbers.add(88888888);

        ArrayList<String> letters = new ArrayList<>();
        letters.add("Z");
        letters.add("X");
        letters.add("H");
        letters.add("J");
        letters.add("P");
        letters.add("A");
        letters.add("K");
        letters.add("Q");
        letters.add("B");
        letters.add("Y");

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            String expectedLetter = letters.get(i);
            String resultingLetter = dniC.calculateLetter(num);
            assertEquals(expectedLetter, resultingLetter);
        }
    }

    @Test
    void testNegativeNumber() {
        try {
            dniC.calculateLetter(-1);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void testNumberTooLarge() {
        try {
            dniC.calculateLetter(100000000);
        } catch (IllegalArgumentException e) {
        }
    }

}
