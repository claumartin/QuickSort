package quickSort;

public class QuickSort {

    public void quickSort(int[] array) {

        quickSortHelper(array, 0, array.length - 1);
    }
  
    private void quickSortHelper(int[] array, int first, int last) {
  
        if (first < last) {
            int splitpoint = partition(array, first, last);
            quickSortHelper(array, first, splitpoint - 1);
            quickSortHelper(array, splitpoint + 1, last);
        }
    }
  
    private int partition(int[] array, int first, int last) {
  
        int pivotvalue = array[first];
        int leftmark = first + 1;
        int rightmark = last;
        boolean done = false;
        int temp = 0;
    
        while (!done) {
            while ((leftmark <= rightmark) && (array[leftmark] <= pivotvalue)) {
                leftmark = leftmark + 1;
            }

            while ((array[rightmark] >= pivotvalue) && (rightmark >= leftmark)) {
                rightmark = rightmark - 1;
            }    
    
            if (rightmark < leftmark) {
                done = true;
            }
            else{
                temp = array[leftmark];
                array[leftmark] = array[rightmark];
                array[rightmark] = temp;
            }
        }
    
        temp = array[first];
        array[first] = array[rightmark];
        array[rightmark] = temp;
    
        return rightmark;
    }
}