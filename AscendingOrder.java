import java.util.Arrays;

public class AscendingOrder {

    public static void main(String[] args){

        int [] arr = {1,5,4,7,10,6};

        System.out.print("Original array is : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)

            System.out.print( arr[i] + " ");

        sortArrayAscending(arr);
    }

    public static int[] sortArrayAscending(int[] arr){

        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nSorted array is : ");

        for (int i = 0; i < arr.length; i++)

            System.out.print(arr[i] + " ");

        return arr;
    }

}
