import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        int[] integers = {1, 2, 4, 5, 6,12,3, 1,23 ,123, 12,31,23 ,123, 5,4, 34,5,345, 67,5,756,86,78,67};
        List<Integer> integers2 = Arrays.asList(1, 2, 4, 5, 6,12,3, 1,23 ,123, 12,31,23 ,123, 5,4, 34,5,345, 67,5,756,86,78,67);


        long start1 = System.nanoTime();

        MergeSort.mergeSort(integers2, 0, integers2.size() - 1);
        long end1 = System.nanoTime();



//        System.out.print("[");
//        for (int i : integers) {
//            System.out.print(i + ", ");
//        }
//        System.out.print("]\n");


//        long start = System.nanoTime();
//
//        MergeSort.mergeSort(integers, 0, integers.length - 1);
//
//
//        long end = System.nanoTime();
//        System.out.print("[");
//        for (int i : integers) {
//            System.out.print(i + ", ");
//        }
//        System.out.print("]\n");



//        System.out.println("Elasped time in ms: \nFrom " + start + "\n  to " + end + " = " + (end - start));
        System.out.println("Elasped time in ms: \nFrom " + start1 + "\n  to " + end1 + " = " + (end1 - start1));
    }
}
