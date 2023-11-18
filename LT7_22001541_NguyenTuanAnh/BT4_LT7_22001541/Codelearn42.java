package LT7_22001541_NguyenTuanAnh.BT4_LT7_22001541;

import java.util.Scanner;

public class Codelearn42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length n: ");
        int n = s.nextInt();
        int [] array = new int[n];
        InsertionSort(array, s);
    }
    static void InsertionSort(int[] array, Scanner sc)
    {
        int n = array.length;
        System.out.println("Enter the value of array with length n: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j -= 1;
            }
            array[j+1] = key;
        }
        printArray(array);
    }

    private static void printArray(int [] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}
