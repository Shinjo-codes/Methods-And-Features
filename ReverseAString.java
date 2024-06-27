public class ReverseAString {

    public static void main(String[] args) {
        String str = "abc";
        String r = reverseString(str);
        System.out.println("The reversed string for " + str  + " is : " + r);
    }
        public static String reverseString(String str){
        int lengthOfString = str.length(); //This line gets the length of the original string
            String reversedString = " "; //stores the reversal of original string.
            for (int i = lengthOfString - 1; i >= 0; i--){
        //This line above loops through the elements of originalString in a decremental order(from highest to lowest)
            reversedString = reversedString + str.charAt(i);//cba
        }
            return reversedString ;
    }
}



