package BT2_CaiDatThuatToanSapXepChen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] list = {1, 3, 45, 4, 7, 8, 95, 3, 1};
    selectSort(list);
    System.out.println("sắp xếp chọn");
    System.out.println(Arrays.toString(list));
    insertionSort(list);
    System.out.println("sắp xếp chèn");
    System.out.println(Arrays.toString(list));
}
    //    sắp xếp chèn
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i -1; j >= 0 && list[j] > temp ; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }
    }


    // sắp xếp chọn
    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

}
