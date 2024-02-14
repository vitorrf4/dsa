package sorting;

public class Counting extends ISorting {
    public Counting(int[] array) {
        super(array);
    }

    // Counts the number of ocurrences of each number in the array,
    // maps the value as an index in an auxilary array,
    // and calculates it back to the result
    public int[] sort() {
        int max = getMax();
        int[] result = new int[array.length + 1];

        int[] countArray = new int[max + 1];

        for (int i = 0; i < array.length; i++)
            countArray[array[i]]++;

        for (int i = 1; i < countArray.length; i++)
            countArray[i] += countArray[i - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            result[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        for (int i = 0; i < array.length; i++)
            array[i] = result[i];
        
        return array;
    }
}
