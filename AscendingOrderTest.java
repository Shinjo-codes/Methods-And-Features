import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AscendingOrderTest {
    @Test
    void testAscendingOrderPositive(){
        int [] arr = {1,5,4,7,10,6};
        int [] sortedArray = AscendingOrder.sortArrayAscending(arr);
        assertEquals(sortedArray, AscendingOrder.sortArrayAscending(arr));

    }
    @Test
    void testAscendingOrderNegative(){
        int [] arr = {-1,-5,-4,-7,-10,-6};
        int [] sortedArray = AscendingOrder.sortArrayAscending(arr);
        assertEquals(sortedArray, AscendingOrder.sortArrayAscending(arr));

    }
    @Test
    void testAscendingOrderMixed(){
        int [] arr = {1,-5,-4,7,-10,6};
        int [] sortedArray = AscendingOrder.sortArrayAscending(arr);
        assertEquals(sortedArray, AscendingOrder.sortArrayAscending(arr));

    }
    @Test
    public void testMainMethod() {
        int [] arr = {1,5,4,7,10,6};
        System.out.print("Original array is : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)

            System.out.print( arr[i] + " ");


        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        AscendingOrder.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Original array is : " + Arrays.toString(arr) + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }

}