import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testInvalid(){
        String result = FizzBuzz.fizzBuzz(158);
        assertEquals("Invalid", result);
    }
    @Test
    void testFizz(){
        String result = FizzBuzz.fizzBuzz(33);
        assertEquals("Fizz", result);
    }
    @Test
    void testBuzz(){
        String result = FizzBuzz.fizzBuzz(25);
        assertEquals("Buzz", result);
    }
    @Test
    void testFizzBuzz(){
        String result = FizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void testMainMethod() {
        String result = FizzBuzz.fizzBuzz(158);
        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        FizzBuzz.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "This is a " + result + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }

}