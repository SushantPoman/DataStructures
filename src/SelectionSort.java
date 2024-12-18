import java.util.Arrays;

//Time complexity worst case - O(n*n )
//Time complexity avg/best case - O(n*n)
class SelectionSort {
    public static void main(String arg[]){
        int arr[] = {5, 4, 10, 1, 6, 2};
        SelectionSort q = new SelectionSort();
        q.selectionSort(arr);
        System.out.println("Selection sort end: "+Arrays.toString(arr));
    }

    void selectionSort(int[] arr) {
        for(int i =0; i< arr.length; i++){
            int min = i;
            for(int j =i+1; j< arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min !=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
