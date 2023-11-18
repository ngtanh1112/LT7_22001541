package LT7_22001541_NguyenTuanAnh.BT2_LT7_22001541;

import LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541.SelectionSort;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        InsertionSortWithT InsertionSort = new InsertionSortWithT();
        SelectionSortWithT SelectionShort = new SelectionSortWithT();
        String[] array = {"abc", "a", "bc", "adsfasf"};
        SelectionShort.sort(array, false);
        printArray(array);
    }

    private static <T extends Comparable>void printArray(T [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
