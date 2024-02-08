package sorting;

public class Quick extends Sorting { // Divides the array into subarrays by choosing a pivot element,
    // sorts the elements smaller than the pivot to the left of it
    // and the larger ones to its right
    // top-down approach
    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = sortPivot(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);

        }
    }

    private int sortPivot(int[] array, int leftmost, int rightmost) {
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
