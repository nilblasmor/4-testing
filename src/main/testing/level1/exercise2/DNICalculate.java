package testing.level1.exercise2;

import java.util.ArrayList;
import java.util.List;

public class DNICalculate {

    private ArrayList<String> letters = new ArrayList<>(
            List.of("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
                    "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E")
    );

    public String calculateLetter(int num) {
        if (num < 0 || num > 99999999) {
            throw new IllegalArgumentException("Invalid DNI number.");
        }
        int index = num % 23;
        return letters.get(index);
    }

}

