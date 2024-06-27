import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfTwoNumbersTest {
    @Test
    public void testSumOfTwo(){
        int a = 7;
        int b = 9;
        int sum = a + b;
        assertEquals(16, SumOfTwoNumbers.sumOfTwo(a,b));
    }
    @Test
    public void testSumOfTwoNegativeNumbers(){
        int a = -7;
        int b = -9;
        int sum = a + b;
        assertEquals(-16, SumOfTwoNumbers.sumOfTwo(a,b));
    }
    @Test
    public void testSumOfTwoMixedNumbers(){
        int a = -7;
        int b = 9;
        int sum = a + b;
        assertEquals(2, SumOfTwoNumbers.sumOfTwo(a,b));
    }

    @Test
    public void testMainMethod() {
        int result = SumOfTwoNumbers.sumOfTwo(4,9);
        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        SumOfTwoNumbers.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "The sum of a and b is : " + result + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }
}