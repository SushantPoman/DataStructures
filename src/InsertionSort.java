import java.util.Arrays;

//Time complexity worst case - O(n*n )
//Time complexity avg/best case - O(n)
class InsertionSort{
    public static void main(String arg[]){
        int arr[] = {5, 4, 10, 1, 6, 2};
        InsertionSort q = new InsertionSort();
        q.insertionSort(arr);
        System.out.println("Insertion sort end: "+Arrays.toString(arr));
    }

    void insertionSort(int[] arr) {
        for(int i =1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > temp ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            System.out.println("Insertion sort iteration: "+Arrays.toString(arr));
        }
    }
}