// Create a program to reverse an array.
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(array);
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversed));
        }
        public static int[] reverseArray(int[] array) {
            int[] reversed = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[array.length - i - 1];
                }
                return reversed;

}
    
}
