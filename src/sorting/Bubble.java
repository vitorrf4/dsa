package sorting;

public class Bubble extends ISorting {
    public Bubble(int[] array) {
        super(array);
    }

    // Swaps the bigger values to the end of the array until is sorted
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public int[] optimizedSort() {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                    swapped = true;
                }
            }
            // if no swapping occurs it means the array
            // has been sorted
            if (!swapped) break;
        }
        return array;
    }
}
