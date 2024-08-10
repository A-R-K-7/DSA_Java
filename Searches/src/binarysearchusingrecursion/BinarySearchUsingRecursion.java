package binarysearchusingrecursion;

import java.util.Arrays;

public class BinarySearchUsingRecursion {

    public int binarySearchRec(int[] array, int target) {
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    private int binarySearchRec(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == target) {
            return middle;
        }
        if (target < array[middle]) {
            return binarySearchRec(array, target, left, middle - 1);
        }
        return binarySearchRec(array, target, middle + 1, right);
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
        int[] array = {6, 5, 1, 2, 4};
        var bs = new BinarySearchUsingRecursion();
        var index = bs.binarySearchRec(array, 6);
        System.out.println("found at index " + index);
    }
}
