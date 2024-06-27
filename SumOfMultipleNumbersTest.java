

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

    class SumOfMultipleNumbersTest {

        @Test
    void testPositiveSumOfMultipleNumbers(){
            int [] arr =  {7,9,23,56,39};
            assertEquals(134, SumOfMultipleNumbers.sumOfMultiple(arr));
        }

        @Test
        void testNegativeSumOfMultipleNumbers(){
            int [] arr =  {-7,-9,-23,-56,-39};
            assertEquals(-134, SumOfMultipleNumbers.sumOfMultiple(arr));
        }

        @Test
        void testSumOfEmptyArrayOfNumbers(){
            int [] arr =  {};
            int result = SumOfMultipleNumbers.sumOfMultiple(arr);
            assertEquals (0, result, "The sum of an empty array should be zero");
        }

        @Test
        void testSumOfSingleArrayOfNumbers(){
            int [] arr =  {3};
            int result = SumOfMultipleNumbers.sumOfMultiple(arr);
            assertEquals (3, result, "The sum of an empty array should be three");
        }

        @Test
        void testSumOfMixedArrayOfNumbers(){
            int [] arr =  {3,-4,9,34,5};
            int result = SumOfMultipleNumbers.sumOfMultiple(arr);
            assertEquals (47, result, "The sum of an empty array should be three");
        }

                   @Test
            public void testMainMethod() {
                // Set up to capture the output from System.out
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                PrintStream originalOut = System.out;
                System.setOut(new PrintStream(outputStream));

                // Call the main method
                SumOfMultipleNumbers.main(new String[]{});

                // Restore the original System.out
                System.setOut(originalOut);

                // Verify the output
                String expectedOutput = "The sum of the array elements [7, 9, 23, 56, 39] is 134" + System.lineSeparator();
                assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
            }
        }
        //Explanation of the test for the main method:
//Capture the Output:
//
//ByteArrayOutputStream is used to capture the output written to System.out.
//System.setOut(new PrintStream(outputStream)) redirects System.out to our custom stream.
//Invoke the main Method:
//
//SumOfMultipleNumbers.main(new String[]{}) is called with an empty array since the main method doesn’t use the command-line arguments.
//Restore System.out:
//
//System.setOut(originalOut) restores the original System.out to avoid side effects on other tests or parts of the program.
//Verify the Output:
//
//The expected output is constructed and compared with the actual captured output. Note that System.lineSeparator() is used to match the newline character in a platform-independent manner.
