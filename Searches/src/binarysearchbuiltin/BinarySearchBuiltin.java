package binarysearchbuiltin;

import java.util.Arrays;

public class BinarySearchBuiltin {

    public static int binarysearch(int[] array, int target) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        var x = Arrays.binarySearch(array, target);
        return x;
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 5, 2, 1};
        int index = binarysearch(array, 7);
        System.out.println("is found at index " + index);
    }
}
