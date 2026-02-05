package testing.level1.exercise3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GenerateExceptionTest {

    public GenerateException ge = new GenerateException();

    @Test
    void testIndexOutOfBoundsException() {
        try {
            ge.generateException();
            fail("Expected IndexOutOfBoundsException was not thrown.");
        } catch (IndexOutOfBoundsException e) {
        }
    }

}