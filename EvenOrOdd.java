public class EvenOrOdd {

    public static void main(String[] args) {
        String result = evenOrOdd(0);

        System.out.println("The number is " + result);
    }

    public static String evenOrOdd(int n) {
        if (n == 0) {
            return "Invalid Number";
        } else {
            return (n % 2 == 0 ? "Even" : "Odd");
        }
        //Ternary operator
    }
}


