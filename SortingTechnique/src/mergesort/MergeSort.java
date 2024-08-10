package SortingTechnique.src.mergesort;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        var middle = array.length / 2;
        int[] left = new int[middle];
        for (var i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        int[] right = new int[array.length - middle];
        for (var i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }
        mergeSort(left);
        System.out.println(Arrays.toString(array));
        mergeSort(right);
        System.out.println(Arrays.toString(array));
        merge(left, right, array);
        System.out.println(Arrays.toString(array));
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int array[] = {8,4,2,1,3};
        System.out.println(Arrays.toString(array));
        ms.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
