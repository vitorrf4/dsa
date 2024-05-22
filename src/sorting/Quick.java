package sorting;

public class Quick extends BaseSorting {
    public Quick(int[] array) {
        super(array);
    } 
    // Divides the array into subarrays by choosing a pivot element,
    // sorts the elements smaller than the pivot to the left of it
    // and the larger ones to its right
    // top-down approach
    @Override
    public void sort() {
        quickSort(array, 0, array.length - 1);
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);

        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        
        return i + 1;
    }
}
