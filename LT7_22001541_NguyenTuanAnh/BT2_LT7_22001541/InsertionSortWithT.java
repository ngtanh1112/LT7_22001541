package LT7_22001541_NguyenTuanAnh.BT2_LT7_22001541;

public class InsertionSortWithT <T extends Comparable<T>>{
    public void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;


            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j+1] = array[j];
                j -= 1;
            }
            array[j+1] = key;
        }
    }
    private void printArray(T [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
