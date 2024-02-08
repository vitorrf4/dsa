package sorting;

public class Bucket extends Sorting {
    // Creates buckets with range of values and places the values to be sorted in each bucket
    // corresponding to its range, and then each bucket also has to be sorted
    public void bucketSort(int[] array, int range) {
        int[][] buckets = new int[10][];
        int[] bucketIndexCounting = new int[10];

        for (int i = 0; i < buckets.length; i++)
            buckets[i] = new int[array.length];

        // Divides each element to its ranged bucket (e.g: 12 in the 10 - 20 bucket)
        for (int number : array) {
            int rangeIndex =   number / (range / 10);
            int bucketIndex = bucketIndexCounting[rangeIndex]++;
            buckets[rangeIndex][bucketIndex] = number;
        }

        Quick quick = new Quick();
        // sort each bucket with another algorithm
        for (int[] bucket : buckets) {
            printArray(bucket);
            quick.quickSort(bucket, 0, bucket.length - 1);
        }

        int arrayIndex = 0;

        for (int[] bucket : buckets) {
            for (int number : bucket) {
                if (number != 0) {
                    array[arrayIndex] = number;
                    arrayIndex++;
                }
            }
        }
    }
}
