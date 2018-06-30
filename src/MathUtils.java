public class MathUtils {
    public static char[] reverseArray(char[] array) {
        array = new StringBuilder(new String(array)).reverse().toString().toCharArray();
        return array;
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        char[] input = {'H','e','l','l','o'};
        System.out.println(reverseArray(input));
    }
}