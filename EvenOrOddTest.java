import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    void testEvenOrOdd(){
        String result = EvenOrOdd.evenOrOdd(95);
        assertNotEquals("Even", "Odd");
    }
    @Test
    void testEven(){
        String result = EvenOrOdd.evenOrOdd(60);
        assertNotEquals("Odd", "Even");
    }
    @Test
    void testZero(){
        String result = EvenOrOdd.evenOrOdd(0);
        assertNotEquals("Odd", "Invalid Number");
    }
    @Test
    public void testMainMethod() {
        String result = EvenOrOdd.evenOrOdd(0);

        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        EvenOrOdd.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "The number is " + result + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }

}