package SortingTechnique.src.bubblesort2;

import java.util.Arrays;

public class BubbleSort2 {

    public void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort2 bs = new BubbleSort2();
        int array[] = {5, 1, 2, 4, 3};
        System.out.println(Arrays.toString(array));
        bs.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
