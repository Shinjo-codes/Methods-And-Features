public class FizzBuzz {

    public static void main(String[] args) {

       String result = fizzBuzz(158);

        System.out.println("This is a " + result);

    }

    public static String fizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) {

            return "FizzBuzz";

        } else if (n % 5 == 0) {

            return "Buzz";

        } else if (n % 3 == 0) {

            return "Fizz";

        } else {

           return "Invalid";
        }
    }
}


