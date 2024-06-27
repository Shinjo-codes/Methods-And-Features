import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseANumberArrayTest {
    @Test
    void testReversePositiveNumberArray(){
        int [] array = {5,8,23,87,59,39};
        int [] reversedArray = ReverseANumberArray.reverseArray(array);
        assertEquals(reversedArray, ReverseANumberArray.reverseArray(array));
    }
    @Test
    void testReverseNegativeNumberArray(){
        int [] array = {-5,-8,-23,-87,-59,-39};
        int [] reversedArray = ReverseANumberArray.reverseArray(array);
        assertEquals(reversedArray, ReverseANumberArray.reverseArray(array));
    }
    @Test
    void testReverseMixedNumberArray(){
        int [] array = {5,-8,23,-87,-59,39};
        int [] reversedArray = ReverseANumberArray.reverseArray(array);
        assertEquals(reversedArray, ReverseANumberArray.reverseArray(array));
    }
    @Test
    public void testMainMethod() {
        int [] array = {5,8,23,87,59,39};

        ReverseANumberArray.reverseArray(array);

        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        ReverseANumberArray.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "The reversed array is "  + Arrays.toString(array) + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }

}