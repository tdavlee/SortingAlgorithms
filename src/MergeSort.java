import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     *
     * @param arr the array to be sorted
     * @param first the index of the first element to sort
     * @param last the index of the last element to sort
     *
     * To sort the whole array, first = 0, last = arr.size() - 1
     *
     */
    static void mergeSort(List<Integer> arr, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(arr, first, mid);
            mergeSort(arr, mid + 1, last);
            merge(arr, first, mid, last);
        }
    }

    static void merge(List<Integer> arr, int first, int mid, int last) {
        List<Integer> temp = new ArrayList<>();

        int firstLeft = first;
        int lastLeft = mid;
        int firstRight = mid + 1;
        int lastRight = last;

        while (firstLeft < lastLeft && firstRight < lastRight) {
            if (arr.get(firstLeft) <= arr.get(firstRight)) {
                temp.add(arr.get(firstLeft++));
            } else {
                temp.add(arr.get(firstRight++));
            }
        }

        while (firstLeft < lastLeft) {
            temp.add(arr.get(firstLeft++));
        }

        while (firstRight < lastRight) {
            temp.add(arr.get(firstRight++));
        }

        arr = temp;
    }



    static void mergeSort(int[] arr, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(arr, first, mid);
            mergeSort(arr, mid + 1, last);
            merge(arr, first, mid, last);
        }
    }



    static void merge(int[] arr, int first, int mid, int last) {
        int [] temp = new int[arr.length];
        int first1 = first, last1 = mid, first2 = mid + 1, last2 = last;
        int index = first;

        while ((first1 <= last1) && (first2 <= last2)) {
            if (arr[first1] <= arr[first2]) {
                temp[index] = arr[first1];
                first1++;
            } else {
                temp[index] = arr[first2];
                first2++;
            }
            index++;
        }

        while (first1 <= last1) {
            temp[index++] = arr[first1++];
        }

        while (first2 <= last2) {
            temp[index++] = arr[first2++];
        }

        for (index = first; index <= last; index++) {
            arr[index] = temp[index];
        }
    }
}