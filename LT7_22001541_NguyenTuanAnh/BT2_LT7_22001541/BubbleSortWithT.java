package LT7_22001541_NguyenTuanAnh.BT2_LT7_22001541;

public class BubbleSortWithT <T extends Comparable<T>>{
    public void sort(T[] array, boolean shouldPrint) {
        int n = array.length;
        int countSwap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if(array[j - 1].compareTo(array[j]) > 0) {
                    swap(array, j-1, j);
                    countSwap += 1;
                }
            }
            if (shouldPrint == true) {
                System.out.println("Array after the "+ i + " loop: ");
                printArray(array);
            }
        }
        if (shouldPrint == true) System.out.println("Number of times swap: " + countSwap);;
    }
    private void swap(T [] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    private void printArray(T [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
