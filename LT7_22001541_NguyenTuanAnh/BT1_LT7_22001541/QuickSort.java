package LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541;

import java.util.Random;

public class QuickSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    private static void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;

        int pivot = array[endIndex];

        int leftPointer = startIndex;
        int rightPointer = endIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, endIndex);

        sort(array, startIndex, leftPointer-1);
        sort(array, leftPointer+1, endIndex);

    }
    private static void swap(int[] arr, int index01, int index02) {
        int temp = arr[index01];
        arr[index01] = arr[index02];
        arr[index02] = temp;
    }
    public static void quickSortTest(int N) {
        int [] arr1 = generateRandomArray(100);
        int [] arr2 = generateRandomArray(1000);
        int [] arr3 = generateRandomArray(10000);
        int [] arr4 = generateRandomArray(100000);

        if (N == 100) {
            //N=100
            System.out.println("Array with length = " + arr1.length + " before Quick Sort: ");
            printArray(arr1);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr1.length + " after Quick Sort: ");
            sort(arr1);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr1);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if(N == 1000) {
            //N=1000
            System.out.println("\nArray with length = " + arr2.length + " before Quick Sort: ");
            printArray(arr2);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr2.length + " after Quick Sort: ");
            sort(arr2);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr2);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 10000) {
            //N=10000
            System.out.println("\nArray with length = " + arr3.length + " before Quick Sort: ");
            printArray(arr3);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr3.length + " after Quick Sort: ");
            sort(arr3);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr3);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 100000) {
            //N=100000
            System.out.println("\nArray with length = " + arr4.length + " before Quick Sort: ");
            printArray(arr4);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr4.length + " after Quick Sort: ");
            sort(arr4);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr4);
            System.out.println("Elapsed time = " + duration + " ms");
        }

    }
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000) + 1;
        }

        return array;
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
