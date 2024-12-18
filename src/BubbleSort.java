import java.util.Arrays;

//Time complexity worst case - O(n*n    )
//Time complexity avg/best case - O(n)
class BubbleSort{

    public static void main(String arg[]){
        int arr[] = {15,16, 6,8,5};
        BubbleSort q = new BubbleSort();
        q.bubbleSort(arr);
        System.out.println("bubble sort end: "+Arrays.toString(arr));
    }

    void bubbleSort(int[] arr) {
        for(int i =0; i<arr.length - 1; i++){
            int flag = 0;
            for (int j =0; j< arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =1;
                }
            }
            if(flag ==0)
                break;
        }
    }

}