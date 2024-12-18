import java.util.Arrays;

//Time complexity worst case - O(n*n)
//Time complexity avg/best case - O(nlogn)
class ShellSort {
    public static void main(String arg[]) {
        int arr[] = {23, 29, 15, 19, 31, 7, 9, 5, 2};
        ShellSort q = new ShellSort();
        q.shellSort(arr);
        System.out.println("Shell sort end: " + Arrays.toString(arr));
    }

    void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap >= 1; gap = gap / 2) {
            for(int j = gap; j<arr.length; j++){
                for(int i = j-gap; i>=0; i=i-gap){
                    if(arr[i+gap] >arr[i]){
                        break;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = temp;
                    }
                }
            }
        }
    }
}
