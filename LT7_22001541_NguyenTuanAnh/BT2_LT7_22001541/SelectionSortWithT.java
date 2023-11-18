package LT7_22001541_NguyenTuanAnh.BT2_LT7_22001541;

public class SelectionSortWithT <T extends Comparable<T>>{
    public void sort(T [] array, boolean shouldPrint) {
        int n = array.length;
        int countSwap = 0;
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j].compareTo(array[index]) < 0) {
                    index = j;
                }
            }
            swap(array, i, index);
            countSwap += 1;
            if (shouldPrint == true) {
                System.out.println("Array after the "+i+" loop: ");
                printArray(array);
            }
        }
        if (shouldPrint == true) {
            System.out.println("Number of times swap: " + countSwap);
        }
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
