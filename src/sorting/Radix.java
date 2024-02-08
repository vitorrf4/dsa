package sorting;

public class Radix extends Sorting {
    // Sorts the elements by grouping the individual digits of the same
    // decimal place and then sorting them in increasing/decreasing order
    private void countingRadix(int[] array, int length, int decimalPlace) {
        int max = getMax(array);
        int[] count = new int[max + 1];
        int[] result = new int[length + 1];

        for (int i = 0; i < length; i++)
            count[(array[i] / decimalPlace) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = length - 1; i >= 0; i--) {
            result[count[(array[i] / decimalPlace) % 10] - 1] = array[i];
            count[(array[i] / decimalPlace) % 10]--;
        }

        for (int i = 0; i < length; i++)
            array[i] = result[i];
    }

    public void radixSort(int[] array) {
        int max = getMax(array);

        for (int decimalPlace = 1; max / decimalPlace > 0; decimalPlace *= 10) {
            countingRadix(array, array.length, decimalPlace);
        }
    }

}
