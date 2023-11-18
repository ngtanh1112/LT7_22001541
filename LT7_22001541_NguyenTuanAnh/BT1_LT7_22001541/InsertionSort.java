package LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541;

import java.util.Random;

public class InsertionSort {
    public static void sort(int[] array, boolean shouldPrint) {
        int countSwap = 0;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j -= 1;
                countSwap += 1;
            }
            if (shouldPrint == true) {
                System.out.println("Array after the " + i + " loop: ");;
                printArray(array);
            }
            array[j+1] = key;
            countSwap += 1;
        }
        System.out.println("Number of times swap: " + countSwap);
    }
    public static void insertionSortTest(int N) {
        int [] arr1 = generateRandomArray(100);
        int [] arr2 = generateRandomArray(1000);
        int [] arr3 = generateRandomArray(10000);
        int [] arr4 = generateRandomArray(100000);

        if (N == 100) {
            //N=100
            System.out.println("Array with length = " + arr1.length + " before Insertion Sort: ");
            printArray(arr1);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr1.length + " after Insertion Sort: ");
            sort(arr1, false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr1);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if(N == 1000) {
            //N=1000
            System.out.println("\nArray with length = " + arr2.length + " before Insertion Sort: ");
            printArray(arr2);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr2.length + " after Insertion Sort: ");
            sort(arr2,false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr2);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 10000) {
            //N=10000
            System.out.println("\nArray with length = " + arr3.length + " before Insertion Sort: ");
            printArray(arr3);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr3.length + " after Insertion Sort: ");
            sort(arr3, false);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr3);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 100000) {
            //N=100000
            System.out.println("\nArray with length = " + arr4.length + " before Insertion Sort: ");
            printArray(arr4);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr4.length + " after Insertion Sort: ");
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
