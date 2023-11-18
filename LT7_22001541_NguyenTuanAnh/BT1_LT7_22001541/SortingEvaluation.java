package LT7_22001541_NguyenTuanAnh.BT1_LT7_22001541;

import java.util.Random;
import java.util.Scanner;

public class SortingEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a) TestSortWithArrayFromKeyboard(scanner);
        //b) TimeEvaluationWithN(scanner);
        //c) TestSortWithRandomN(scanner);
        //d) TestArrayStatusAndSwapTimes(scanner);
        //e) TimeEvaluationWithN(scanner);

    }

    public static void TestSortWithArrayFromKeyboard(Scanner scanner) {
        System.out.println("Enter the length of array: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        try {
            System.out.println("Choose sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BubbleSort.sort(array, false);
                    break;
                case 2:
                    InsertionSort.sort(array, false);
                    break;
                case 3:
                    SelectionSort.sort(array, false);
                    break;
                case 4:
                    MertSort.sort(array);
                    break;
                case 5:
                    QuickSort.sort(array);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        System.out.println("Array after sorting: ");
        printArray(array);
    }
    public static void TestSortWithRandomN(Scanner scanner) {
        int [] array = generateRandomArray();
        System.out.println("Array before sorting: ");
        printArray(array);
        try {
            System.out.println("Choose sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BubbleSort.sort(array, false);
                    break;
                case 2:
                    InsertionSort.sort(array, false);
                    break;
                case 3:
                    SelectionSort.sort(array, false);
                    break;
                case 4:
                    MertSort.sort(array);
                    break;
                case 5:
                    QuickSort.sort(array);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        System.out.println("Array after sorting: ");
        printArray(array);

    }
    public static void TestArrayStatusAndSwapTimes(Scanner scanner) {
        int [] array = generateRandomArray();
        System.out.println("Array before sorting: ");
        printArray(array);
        try {
            System.out.println("Choose sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BubbleSort.sort(array, true);
                    break;
                case 2:
                    InsertionSort.sort(array, true);
                    break;
                case 3:
                    SelectionSort.sort(array, true);
                    break;
                case 4:
                    MertSort.sort(array);
                    break;
                case 5:
                    QuickSort.sort(array);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        System.out.println("Array after sorting: ");
        printArray(array);

    }
    public static void TimeEvaluationWithN(Scanner scanner) {
        try {
            System.out.print("Enter the value of N (N must be 100 || 1000 || 10000 || 100000): ");
            int N = scanner.nextInt();

            if (N == 100 || N == 1000 || N == 10000 || N == 100000) {
                System.out.println("Choose sorting algorithm:");
                System.out.println("1. Bubble Sort");
                System.out.println("2. Insertion Sort");
                System.out.println("3. Selection Sort");
                System.out.println("4. Merge Sort");
                System.out.println("5. Quick Sort");
                System.out.print("Enter your choice (1-5): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        BubbleSort.bubbleSortTest(N);
                        break;
                    case 2:
                        InsertionSort.insertionSortTest(N);
                        break;
                    case 3:
                        SelectionSort.selectionSortTest(N);
                        break;
                    case 4:
                        MertSort.mertSortTest(N);
                        break;
                    case 5:
                        QuickSort.quickSortTest(N);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            } else {
                System.out.println("Invalid value of N. Please enter 100, 1000, 10000, or 100000.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    private static int[] generateRandomArray() {
        Random random = new Random();
        int size = random.nextInt(50) + 1;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000) + 1;
        }

        return array;
    }
}