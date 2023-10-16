public class Util {
    public static String reverseString(String inputStr) {
        return new StringBuilder(inputStr).reverse().toString();
    }

    public static String capitalizeString(String inputStr) {
        return inputStr.toUpperCase();
    }

    public static String lowercaseString(String inputStr) {
        return inputStr.toLowerCase();
    }
}
