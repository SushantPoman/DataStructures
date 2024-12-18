import java.util.Arrays;

//Time complexity worst case - O(n*n)
//Time complexity avg/best case - O(nlogn)
class QuickSort {
    public static void main(String arg[]){
        int arr[] = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length-1);
        System.out.println("quick sort end: "+Arrays.toString(arr));
    }

    void quickSort(int[] arr, int lb, int ub) {
        if(lb < ub) {
            System.out.println("quick sort start: "+Arrays.toString(arr));
            int loc = partition(arr, lb, ub);
//            left side of array will sort
            quickSort(arr, lb, loc - 1);
//            right side of array will sort
            quickSort(arr, loc + 1, ub);
        }
    }

    int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start < end){
            while(arr[start] <= pivot && start < ub ){
                start++;
            }
            while(arr[end] > pivot ){
                end--;
            }
            if(start < end){
//                swap(arr[start], arr[end]);
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
//        swap pivot with arr[end] - which is less than pivot
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }
}
