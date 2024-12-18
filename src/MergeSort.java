import java.util.Arrays;

//Time complexity avg/best/worst case - O(nlogn)
class MergeSort {
    public static void main(String arg[]) {
        int arr[] = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        MergeSort q = new MergeSort();
        q.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge sort end: "+Arrays.toString(arr));
    }

    void merge(int[] arr, int lb, int mid, int ub) {
//        Find sizes of two subarrays to be merged
        int n1 = mid - lb + 1;
        int n2 = ub - mid;

//        create temp arrays
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

//        copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            lArr[i] = arr[lb + i];
        for (int j = 0; j < n2; ++j)
            rArr[j] = arr[mid + 1 + j];

//        merge arrays
        int i = 0, j = 0, k = lb;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

//        copy remaining elements of left array
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

//        copy remaining elements of right array
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
//            int mid = (lb + ub) / 2;
            int mid = lb+ (ub - lb)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);

            merge(arr, lb, mid, ub);
        }
    }
}
