package LT7_22001541_NguyenTuanAnh.BT6_LT7_22001541;

import LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541.BubbleSort;

public class FindKMin {
    public static void main(String[] args) {
        int[] array = {9,4,7,5,1,3};
        findKMin(array, 2);
    }

    private static void findKMin(int[] array, int K) {
        sort(array);
        System.out.println("The " + K + "th smallest number is " + array[K]);
    }

    private static void sort(int[] array) {
        BubbleSort.sort(array, false);
    }
}
