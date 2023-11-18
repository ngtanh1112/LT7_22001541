package LT7_22001541_NguyenTuanAnh.BT4_LT7_22001541;

public class Codelearn46 {
    public static void main(String[] args) {
        int a[] = {1,5,8,2,3};
        quickSort(a);
        printArray(a);
    }
    static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
    static void quickSort(int[] a, int startIndex, int endIndex) {

        if (startIndex >= endIndex) return;

        int leftPointer = startIndex;
        int righPointer = endIndex;

        int pivot = a[endIndex];

        while (leftPointer < righPointer) {
        while (a[leftPointer] <= pivot && leftPointer < righPointer) {
            leftPointer++;
        }

        while (a[righPointer] >= pivot && leftPointer < righPointer) {
            righPointer--;
        }
            swap(a, leftPointer, righPointer);
        }

        swap(a, leftPointer, endIndex);
        quickSort(a,startIndex, leftPointer-1);
        quickSort(a, leftPointer+1, endIndex);
    }
    private static void swap(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
