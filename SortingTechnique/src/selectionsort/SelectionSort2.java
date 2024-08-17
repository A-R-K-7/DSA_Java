package SortingTechnique.src.selectionsort;

import java.util.Arrays;

public class SelectionSort2 {

    public void selectionSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
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
        SelectionSort2 ss = new SelectionSort2();
        int[] array = {5, 1, 2, 4, 3};
        System.out.println(Arrays.toString(array));
        ss.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
