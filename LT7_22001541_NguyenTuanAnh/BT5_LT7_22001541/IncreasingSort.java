package LT7_22001541_NguyenTuanAnh.BT5_LT7_22001541;

import java.util.Scanner;

public class IncreasingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        sort(arr);
        System.out.println();
        printArray(arr);
    }
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
    private static void printArray(int [] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }


}
