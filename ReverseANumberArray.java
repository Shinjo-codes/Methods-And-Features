import java.util.Arrays;

public class ReverseANumberArray {

    public static void main(String[] args){

        int [] array = {5,8,23,87,59,39};

        reverseArray(array);
        System.out.println("The reversed array is "  + Arrays.toString(array) );
    }
    public static int[] reverseArray(int[] array) {
        int i = 0, j = array.length - 1; // swaps the element i with j at the end of the array
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    }

