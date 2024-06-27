import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberTest {
    @Test
    public void testLargestNumber() {
        int[] arr = {-10, -15, 0, -40, 23, 89};
        assertEquals(89, LargestNumber.findLargest(arr));
    }

    @Test
    public void testToFindLargestNumberWithAscendingNumber() {
        int[] arr = {-40, -15, -10, 0, 23, 89};
        int expected = 89;
        int actual = LargestNumber.findLargest(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testToFindSingleElementArray() {
        int[] arr = {20};
        int expected = 20;
        int actual = LargestNumber.findLargest(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testToFindWrongSingleElementArray() {
        int[] arr = {20};
        int expected = 20;
        int actual = LargestNumber.findLargest(arr);
        assertNotEquals(40,actual);
    }

    @Test
    public void testToFindLargestNumberWithDescendingOrder() {
        int[] arr = {89, 23, 0, -10, -15, -40};
        int expected = 89;
        int actual = LargestNumber.findLargest(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testToFindWrongLargestNumberWithDescendingOrder() {
        int[] arr = {89, 23, 0, -10, -15, -40};
        int expected = 89;
        int actual = LargestNumber.findLargest(arr);
        assertNotEquals(23, actual);
    }

    @Test
    public void testToFindLargestNumberWithNullArray() {
        int[] arr = null;
            assertThrows(NullPointerException.class, () -> {LargestNumber.findLargest(arr);});
        }
    @Test
    public void testMainMethod() {
        int[] arr = {-10, -15, 0, -40, 23, 89};

        int largestNumber = LargestNumber.findLargest(arr);
        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        LargestNumber.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "The largest number in the array is : " + largestNumber + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }
    }
//More tests to write:
/*Test to find largest number with zero;
Test to find largest number with equal number;
 */

