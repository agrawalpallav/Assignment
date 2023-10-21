import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(myArray);

        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
