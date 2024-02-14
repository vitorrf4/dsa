package sorting;

public class Selection extends ISorting {
    public Selection(int[] array) {
        super(array);
    }

    // Selects the smallest element in the array and compares it with the subsequent
    // values, in the end of the iteration swaps the smallest value to the beginning of the array
    public int[] sort() {
        int swapIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int minimum = array[i];

            for (int j = i; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j];
                    swapIndex = j;
                }
            }

            if (minimum != array[i]) {
                int aux = array[i];
                array[i] = minimum;
                array[swapIndex] = aux;
            }
        }
        return array;
    }
}
