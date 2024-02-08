package sorting;

public class Bubble extends Sorting {
    // Swaps the bigger values to the end of the array until it's sorted
    public void bubbleSort(int[] array) {
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

    public void optimizedBubbleSort(int[] array) {
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
    }
}
