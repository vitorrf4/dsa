package sorting;

import java.util.Arrays;

public abstract class ISorting {
    public int[] array;
    
    public ISorting(int[] array) {
        this.array = array;    
    }

    protected int getMax() {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
    
    public long sortAndGetDurationInMs() {
        long start = System.currentTimeMillis();
        sort();
        long end = System.currentTimeMillis();
        return end - start; 
    }

    public void printArray() {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }

    public void printArray(int[] array) {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
    
    public boolean IsSorted() {
        int min = array[0];
        for (int i : array) {
            if (i >= min) {
                min = i;
                continue;
            }
            return false;
        }
        return true;
    }
    
    public void printArrayWithLineEnd() {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
    
    public abstract void sort();
}
