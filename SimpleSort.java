/**
 * Implementation from the Simplesort algorithm.
 */

public class SimpleSort {

    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }

        int[] sorted = sort(array);

        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }

    public static int[] sort(int[] array) {
        int k;
        for (int i = array.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] >= array[i]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        return array;
    }
}
