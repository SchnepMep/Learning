import java.util.Arrays;
import java.util.Random;

public class Shakersort {

    public static void main(String[] args) {
        int[] array = new int[15];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Original Sequence: " + Arrays.toString(array));

        int[] sorted = shakerSort(array);

        System.out.println("Sorted Sequence: " + Arrays.toString(sorted));

    }

    public static int[] shakerSort(int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            boolean swapped = false;
            for (int j = i; j < values.length - i - 1; j++) {
                if (values[j] < values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
            for (int j = values.length - 2 - i; j > i; j--) {
                if (values[j] > values[j - 1]) {
                    int tmp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return values;
    }
}
