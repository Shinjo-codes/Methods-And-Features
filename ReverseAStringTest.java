import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {
    @Test
    void testReverseString(){
        String str = "abc";
        String r = ReverseAString.reverseString(str);
        assertEquals(" cba", r);
    }
    @Test
    public void testMainMethod() {
        String str = "abc";
        String r = ReverseAString.reverseString(str);
        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        ReverseAString.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "The reversed string for " + str  + " is : " + r + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }

}