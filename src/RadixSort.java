import java.util.Arrays;

//Time complexity worst case - O(n*n)
//Time complexity avg/best case - O(nlogn)
class RadixSort {
    public static void main(String arg[]) {
        int arr[] = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        RadixSort q = new RadixSort();
        q.radixSort(arr);
    }

    void radixSort(int[] arr) {
        int max = getMax(arr);
        int resultArr[] = arr;
        for (int pos = 1; max/pos > 0; pos = pos * 10) {
           resultArr = countSort(resultArr, arr.length, pos);
        }
        System.out.println("Radix sort: " + Arrays.toString(resultArr));
    }

    int[] countSort(int[] arr, int n, int pos) {
        int countArr[] = new int[10];
        int sortArr[] = new int[arr.length];

//        insert the counter of value at the index of countArr
        for (int i = 0; i < n; i++) {
//            countArr[arr[i]] = countArr[arr[i]]++;
            ++countArr[(arr[i]/pos)%10];
        }

//        update value of countArr
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] = countArr[i] + countArr[i - 1];
        }

//        positioning array at proper index using another array
        for (int i = arr.length - 1; i >= 0; i--) {
            sortArr[--countArr[((arr[i]/pos)%10)]] = arr[i];
        }
        return sortArr;
    }

    int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

}
