import sorting.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var max = 30000;
        var array = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = (int)(Math.random() * 5000);
        }

        var sortAlghorithm = new Quick(array);
        var time = sortAlghorithm.sortAndGetDurationInMs();

        System.out.println("Is sorted: " + sortAlghorithm.IsSorted());
        System.out.println("sorting took " + time + " miliseconds");
    }
    
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        return array;    
    }
}