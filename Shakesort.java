public class ShakerSort {

    private int[] array = { 16, 23, 14, 8, 3, 19};
    private int reminder;

    public ShakerSort() {}

    public static void main(String[] args) {
        ShakerSort shakerSort = new ShakerSort();
        int[] resultArray = shakerSort.sort();

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(new StringBuilder().append(i + 1).append(": ").append(resultArray[i]).toString());
        }
    }

    /**
     * Executes the algorithm
     * @return
     */

    public int[] sort() {
        int length = array.length;
        int i = 0;

        while (i < length) {
            shakeAhead(i, length);
            length--;
            shakeBehind(i, length);
            i++;
        }

        return array;
    }

    /**
     * Goes from the front through the array
     * @param paramInt
     * @param paramInt2
     */

    private void shakeAhead(int paramInt, int paramInt2) {
        for (int i = paramInt; i < paramInt2 - 1; i++) {
            if (array[i] > array[i + 1]) {
                reminder = array[i];
                array[i] = array[i + 1];
                array[i + 1] = reminder;
            }
        }
    }

    /**
     * Goes from the behind through the array
     * @param paramInt
     * @param paramInt2
     */

    private void shakeBehind(int paramInt, int paramInt2) {
        for (int i = paramInt2 - 1; i >= paramInt; i--) {
            if (array[i] > array[i + 1]) {
                reminder = array[i];
                array[i] = array[i + 1];
                array[i + 1] = reminder;
            }
        }
    }
}
