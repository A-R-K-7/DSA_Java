package Dynamicarrays.src.dynamicarray;
class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        resizeIfRequired();
        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }
        resizeIfRequired();
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        count++;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
    }

    public void reverse() {
        int[] newItems = new int[count];
        for (int i = 0; i < count; i++) {
            newItems[i] = items[count - i - 1];
        }
        items = newItems;
    }

    public int max() {
        int max = 0;
        for (int item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public Array intersect(Array other) {
        var intersection = new Array(count);
        for (int item : items) {
            if (other.indexOf(item) >= 0) {
                intersection.insert(item);
            }
        }
        return intersection;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}

public class DynamicArray {

    public static void main(String[] args) {
        Array a1 = new Array(1);
        a1.insert(10);
        a1.insert(20);
        a1.insert(30);
        a1.insert(40);
        a1.insert(50);
        a1.print();
    }
}
