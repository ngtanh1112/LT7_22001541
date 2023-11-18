package LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541;

import java.util.Random;

public class SelectionSort {
    public static void sort(int [] array, boolean shouldPrint) {
        int n = array.length;
        int countSwap = 0;
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[index]) {
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
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void selectionSortTest(int N) {
        int [] arr1 = generateRandomArray(100);
        int [] arr2 = generateRandomArray(1000);
        int [] arr3 = generateRandomArray(10000);
        int [] arr4 = generateRandomArray(100000);

        if (N == 100) {
            //N=100
            System.out.println("Array with length = " + arr1.length + " before Selection Sort: ");
            printArray(arr1);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr1.length + " after Selection Sort: ");
            sort(arr1, false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr1);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if(N == 1000) {
            //N=1000
            System.out.println("\nArray with length = " + arr2.length + " before Selection Sort: ");
            printArray(arr2);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr2.length + " after Selection Sort: ");
            sort(arr2, false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr2);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 10000) {
            //N=10000
            System.out.println("\nArray with length = " + arr3.length + " before Selection Sort: ");
            printArray(arr3);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr3.length + " after Selection Sort: ");
            sort(arr3, false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr3);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 100000) {
            //N=100000
            System.out.println("\nArray with length = " + arr4.length + " before Selection Sort: ");
            printArray(arr4);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr4.length + " after Selection Sort: ");
            sort(arr4, false);
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
