package sorting;

public class Insertion extends ISorting {
    public Insertion(int[] array) {
        super(array);
    }

    // Iterates over every value of the array and compares it with its predecessors until it's placed
    // in the appropriated place
    public int[] sort() {
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
        return array;
    }
}
