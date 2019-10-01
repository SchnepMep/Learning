public class SelectionSort {

    public static void main(String a[]){
         
        int[] values = {1, 1010, 34, 2, 56, 7, 67, 78, 42};
        int[] array = selectionSort(values);
        for (int i : array) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
 
    public static int[] selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
