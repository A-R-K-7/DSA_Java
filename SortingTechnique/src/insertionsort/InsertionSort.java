package SortingTechnique.src.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int array[] = {5, 1, 2, 4, 3};
        System.out.println(Arrays.toString(array));
        is.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
