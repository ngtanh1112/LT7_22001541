package LT7_22001541_NguyenTuanAnh.BT4_LT7_22001541;

import LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541.BubbleSort;

import java.util.Random;
import java.util.Scanner;

public class Codelearn41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length n: ");
        int n = s.nextInt();
        int [] array = new int[n];
        bubbleSort(array, s);
    }
    /*Nhập vào số nguyên dương n, tiếp theo là n số nguyên của dãy số a.
      Hãy sắp xếp dãy số a thành dãy không giảm (số sau không bé hơn số trước) và
      in dãy đó ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.*/
    static void bubbleSort(int[] array, Scanner sc) {
        int n = array.length;
        System.out.println("Enter the value of array with length n: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int [] arr) {
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}
