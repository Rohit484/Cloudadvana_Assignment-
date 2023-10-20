import java.util.*;
public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            // Swap the current element with the randomly selected element
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
