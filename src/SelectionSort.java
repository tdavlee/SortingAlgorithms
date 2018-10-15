import java.util.List;

public class SelectionSort {
    static void selectionSort(List<Integer> arr, int first, int last) {
        for (int i = first; i <= last - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k <= last; k++) {
                if (arr.get(k) < arr.get(minIndex)) {
                    minIndex = k;
                }
                if (minIndex != i) {
                    swap(arr, minIndex, i);
                }
            }
        }
    }

    static void swap(List<Integer> arr, int first, int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}
