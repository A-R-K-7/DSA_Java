package Searches.src.binarysearchusingiteration;

import java.util.Arrays;

public class BinarySearchUsingIteration {

    public int binarysearchiter(int[] array, int target) {
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        var left = 0;
        var right = array.length - 1;
        while (left <= right) {
            var middle = (left + right) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public void sort(int[] array) {
        boolean isSorted;
        for (var i = 0; i < array.length; i++) {
            isSorted = true;
            for (var j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
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
        int[] numbers = {7, 1, 3, 6, 5};
        var ls = new BinarySearchUsingIteration();
        int index = ls.binarysearchiter(numbers, 7);
        System.out.println("is found at index " + index);
    }
}
