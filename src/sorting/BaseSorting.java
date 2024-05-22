package sorting;

import java.util.Arrays;

public abstract class BaseSorting {
    public int[] array;
    
    public BaseSorting(int[] array) {
        this.array = array;    
    }
    
    public abstract void sort();

    public long sortAndGetDurationInMs() {
        long start = System.currentTimeMillis();
        sort();
        long end = System.currentTimeMillis();
        return end - start;
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
    
    protected int getMax() {
        if (array.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    public void printArray() {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }

    public void printArray(int[] array) {
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
    
}
