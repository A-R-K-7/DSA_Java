package SortingTechnique.src.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted;
        for (var i = 0; i < array.length; i++) {
            isSorted = true;
            for (var j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                    System.out.println(Arrays.toString(array));
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int array[] = {5, 1, 2, 4, 3};
        System.out.println(Arrays.toString(array));
        bs.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
