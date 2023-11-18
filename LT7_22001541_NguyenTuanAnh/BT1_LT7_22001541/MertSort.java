package LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541;

import java.util.Random;

public class MertSort {
    public static void sort(int [] array) {
        int length = array.length;
        if (array.length <= 1) return;

        int middle = length/2;
        int [] leftArray = new int [middle];
        int [] rightArray = new int [length - middle];

        int l = 0;
        int r = 0;

        for(; l < length; l++) {
            if (l < middle) {
                leftArray[l] = array[l];
            } else {
                rightArray[r] = array[l];
                r++;
            }
        }

        sort(leftArray);
        sort(rightArray);
        merge(array, leftArray, rightArray);
    }
    private static void merge(int [] array, int [] leftArray, int [] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
    public static void mertSortTest(int N) {
        int [] arr1 = generateRandomArray(100);
        int [] arr2 = generateRandomArray(1000);
        int [] arr3 = generateRandomArray(10000);
        int [] arr4 = generateRandomArray(100000);

        if (N == 100) {
            //N=100
            System.out.println("Array with length = " + arr1.length + " before Mert Sort: ");
            printArray(arr1);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr1.length + " after Mert Sort: ");
            sort(arr1);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr1);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if(N == 1000) {
            //N=1000
            System.out.println("\nArray with length = " + arr2.length + " before Mert Sort: ");
            printArray(arr2);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr2.length + " after Mert Sort: ");
            sort(arr2);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr2);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 10000) {
            //N=10000
            System.out.println("\nArray with length = " + arr3.length + " before Mert Sort: ");
            printArray(arr3);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr3.length + " after Mert Sort: ");
            sort(arr3);
            long duration = (System.nanoTime() - startTime) / 1000000;
            printArray(arr3);
            System.out.println("Elapsed time = " + duration + " ms");
        }

        else if (N == 100000) {
            //N=100000
            System.out.println("\nArray with length = " + arr4.length + " before Mert Sort: ");
            printArray(arr4);
            long startTime = System.nanoTime();
            System.out.println("Array with length = " + arr4.length + " after Mert Sort: ");
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
