import java.util.Arrays;

public class SumOfMultipleNumbers {

    public static void main(String[] args) {
         int [] arr =  {7,9,23,56,39};
         int sum = sumOfMultiple(arr);
        System.out.println("The sum of the array elements " + Arrays.toString(arr) + " is " + sum);
    }
        public static int sumOfMultiple (int[] arr){
            int sumOfNumbers = 0;
            for (int i = 0; i < arr.length; i++) {
                sumOfNumbers += arr[i];
            }
            return sumOfNumbers;
        }

    }

