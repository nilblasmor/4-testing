package testing.level1.exercise3;

import java.util.ArrayList;

public class GenerateException {

    public void generateException() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);

        numbers.get(3);
    }
}