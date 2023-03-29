package BT1_MinhHoaThuatToanSapXepChen;

import java.util.Arrays;

public class insertionSort {
    static int[] list = {9, 5, -6, 4, 2, 1, 3, 8, -2, 10};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(list));
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
            System.out.println(i+" : "+ Arrays.toString(list));
        }
    }
}
