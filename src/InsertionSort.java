import java.util.List;

public class InsertionSort {
    static void insertionSort(List<Integer> arr, int first, int last) {
        for (int i = first; i < last; i++) {
            for (int k = i; k > 0 && (arr.get(k) < arr.get(k - 1)); k--) {
                swap(arr, k, k -1);
            }
        }
    }

    static void swap(List<Integer> arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}
