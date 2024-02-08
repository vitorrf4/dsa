package sorting;

public class Insertion extends Sorting {
    // Iterates over every value of the array and compares it with its predecessors until it's placed
    // in the appropriated place
    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i;

            while (j > 0 && key < array[j - 1] ) {
                int aux = array[j];
                array[j] = array[j - 1];
                array[j -1] = aux;
                j--;
            }
        }
    }
}
