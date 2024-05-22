import sorting.*;

public class Main {
    public static void main(String[] args) {
        var array = createRandomIntArray(100000);

        var sortAlghorithm = new Counting(array);
        var time = sortAlghorithm.sortAndGetDurationInMs();

        System.out.println("Is sorted: " + sortAlghorithm.IsSorted());
        System.out.println("Sorting took " + time + " miliseconds");
    }
    
    public static int[] createRandomIntArray(int size) {
        var array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100000);
        }
        
        return array;
    }
}