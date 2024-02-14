package sorting;

public class Quick extends ISorting {
    public Quick(int[] array) {
        super(array);
    } 
    // Divides the array into subarrays by choosing a pivot element,
    // sorts the elements smaller than the pivot to the left of it
    // and the larger ones to its right
    // top-down approach
    @Override
    public int[] sort() {
        return quickSort(array, 0, array.length - 1);
    }

    public int[] quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);

        }
        return array;
    }

    private int partition(int[] array, int leftmost, int rightmost) {
        int pivot = array[rightmost];
        int pivotFinalPosition = leftmost;

        for (int comparrision = leftmost; comparrision < rightmost; comparrision++) {
            if (array[comparrision] < pivot) {
                int aux = array[comparrision];
                array[comparrision] = array[pivotFinalPosition];
                array[pivotFinalPosition] = aux;

                pivotFinalPosition++;
                comparrision = pivotFinalPosition;
            }
        }

        int aux = array[pivotFinalPosition];
        array[pivotFinalPosition] = pivot;
        array[rightmost] = aux;

        return pivotFinalPosition;
    }
}
