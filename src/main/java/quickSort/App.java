package quickSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] array1 = {2,5,8,7,1};
        QuickSort quickSort = new QuickSort();
        System.out.println(Arrays.toString(array1));
        quickSort.quickSort(array1);
        System.out.println(Arrays.toString(array1) + "\n");

        int[] array2 = {1,5,9,8,7,3,2,6};
        System.out.println(Arrays.toString(array2));
        quickSort.quickSort(array2);
        System.out.println(Arrays.toString(array2) + "\n");

        int[] array3 = {20,5,8,9,16,12,7,50,33,12,5};
        System.out.println(Arrays.toString(array3));
        quickSort.quickSort(array3);
        System.out.println(Arrays.toString(array3) + "\n");

        int[] array4 = {66,2,40,31,29,54,8,3};
        System.out.println(Arrays.toString(array4));
        quickSort.quickSort(array4);
        System.out.println(Arrays.toString(array4));
    }
}
