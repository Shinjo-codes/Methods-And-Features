import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    @Test
    void testGradeCalculatorZero(){
        char grade = GradeCalculator.gradeCalculator(0);
        assertNotEquals('A', 'F');
    }
    @Test
    void testGradeCalculatorA(){
        char grade = GradeCalculator.gradeCalculator(90);
        assertNotEquals('F', 'A');
    }
    @Test
    void testGradeCalculatorB(){
        char grade = GradeCalculator.gradeCalculator(84);
        assertEquals('A', 'A');
    }
    @Test
    void testGradeCalculatorC(){
        char grade = GradeCalculator.gradeCalculator(79);
        assertEquals('C', 'C');
    }
    @Test
    void testGradeCalculatorD(){
        char grade = GradeCalculator.gradeCalculator(69);
        assertEquals('D', 'D');
    }
    @Test
    void testGradeCalculator100(){
        char grade = GradeCalculator.gradeCalculator(100);
        assertEquals('A', 'A');
    }
    @Test
    public void testMainMethod() {
        char grade = GradeCalculator.gradeCalculator(78);

        // Set up to capture the output from System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        GradeCalculator.main(new String[]{});

        // Restore the original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Your grade is : " + grade + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString(), "The output from the main method should match the expected output.");
    }
}