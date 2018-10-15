import java.util.List;

public class BubbleSort {
    static void bubbleSort(List<Integer> arr, int first ,int last) {
        for (int i = first; i <= last - 1; i++) {
            for (int k = i + 1; k <= last; k++) {
                if (arr.get(i) > arr.get(k)) {
                    swap(arr, i, k);
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
