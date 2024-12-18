import java.util.Arrays;

//Time complexity worst case - O(n*n)
//Time complexity avg/best case - O(nlogn)
class CountSort {
    public static void main(String arg[]) {
        int arr[] = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
        CountSort q = new CountSort();
        q.countSort(arr);
    }

    void countSort(int[] arr) {
        int countArr[] = new int[10];
        int sortArr[] = new int[arr.length];

//        insert the counter of value at the index of countArr
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]] = countArr[arr[i]]++;
        }

//        update value of countArr
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] = countArr[i] + countArr[i - 1];
        }

//        positioning array at proper index using another array
        for (int i = arr.length - 1; i >= 0; i--) {
            sortArr[--countArr[arr[i]]] = arr[i];
        }
        System.out.println("Count sort: " + Arrays.toString(sortArr));
    }
}
