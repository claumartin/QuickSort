package quickSort;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class AppTest {

    @Test
    public void quickSortTest() {

        int[] test = {1,5,9,8,7,3,2,6};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(test);

        assertTrue(sortedTest(test));
    }

    @Test
    public void quickSortTest1() {

        int[] test1 = {2,5,8,7,1};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(test1);

        assertTrue(sortedTest(test1));
    }

    @Test
    public void quickSortTest2() {

        int[] test2 = {20,5,8,9,16,12,7,50,33,12,5}; 

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(test2);

        assertTrue(sortedTest(test2));
    }

    @Test
    public void quickSortTest3() {

        int[] test3 = {66,2,40,31,29,54,8,3};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(test3);

        assertTrue(sortedTest(test3));
    }

    public boolean sortedTest(int[] array) {

        int previous = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] < previous) {
                return false;
            }         
            previous = array[i];
        }
        
        return true;
    }
}
