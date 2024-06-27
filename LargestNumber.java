public class LargestNumber {

    public static void main(String[] args) {


        int[] arr = {-10, -15, 0, -40, 23, 89};

        int largestNumber = findLargest(arr);

        System.out.println("The largest number in the array is : " + largestNumber);

    }

    public static int findLargest(int[] arr){

            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            }

            return max;
    }
    }

