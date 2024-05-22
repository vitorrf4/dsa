package sorting;

public class Merge extends BaseSorting {
    private boolean commentMerging = false;
    private final int end = array.length - 1;

    public Merge(int[] array) {
        super(array);
    }
    
    public Merge(int [] array, boolean commentMerging) {
       super(array);
       this.commentMerging = commentMerging;
    }

    // Divides the array in halves recursively into subarrays until they're composed of a single item
    // and then order the values by reassembling the subarrays
    // bottom-up approach
    public void sort() {
        int start = 0;
        sort(array, start, end);
    }
    
    public void sort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;

            sort(array, start, middle);
            sort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }
    
    private void merge(int[] array, int start, int middle, int end) {
        int[] subA1 = new int[(middle - start + 1)];
        int[] subB2 = new int[(end - middle)];

        for (int j = 0; j < subA1.length; j++)
            subA1[j] = array[start+j];

        for (int j = 0; j < subB2.length; j++)
            subB2[j] = array[middle+j+1];

        int pointer1 = 0;
        int pointer2 = 0;
        int i = start;

        if (commentMerging) {
            System.out.print("Merging [ ");
            printArray(subA1);
            System.out.print("] and [ ");
            printArray(subB2);
            System.out.println("]");
        }

        while (pointer1 < subA1.length && pointer2 < subB2.length && i < end) {
            if (subA1[pointer1] <= subB2[pointer2]) {
                if (commentMerging)
                    System.out.printf("i: %d | %d <= %d\n", i, subA1[pointer1], subB2[pointer2]);
                
                array[i] = subA1[pointer1];
                pointer1++;
            }
            else {
                if (commentMerging) 
                    System.out.printf("i: %d | %d <= %d\n", i, subB2[pointer2], subA1[pointer1]);
                
                array[i] = subB2[pointer2];
                pointer2++;
            }
            i++;
        }

        while (pointer1 < subA1.length) {
            array[i] = subA1[pointer1];
            pointer1++;
            i++;
        }
        while (pointer2 < subB2.length) {
            array[i] = subB2[pointer2];
            pointer2++;
            i++;
        }

        if (commentMerging) {
            System.out.print("Merge ended: ");
            for (int j = 0; j < array.length; j++) {
                if (j == start) System.out.print("[ ");
                System.out.print(array[j] + " ");
                if (j == end) System.out.print("] ");
            }
            System.out.println("\n");
        }
    }

}
