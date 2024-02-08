package sorting;

import java.util.Arrays;

public class Sorting {
    public void mySort(int[] array) {
        int aux;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                aux = array[i+1];
                array[i+1] = array[i];
                array[i] = aux;
                i = 0;
            }
        }
    }

    protected int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    protected void printArray(int[] numbers) {
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
    }

    protected void printArrayWithLineEnd(int[] numbers) {
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
