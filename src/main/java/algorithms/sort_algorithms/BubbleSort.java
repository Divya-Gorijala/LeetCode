package algorithms.sort_algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,6,5,7};
        int temp;
        boolean swapped;
        outer:
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.println(swapped);
                break outer;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }


}


//Best Case: If the array is already sorted, the algorithm will terminate after just one pass
// with no swaps, resulting in a time complexity of O(n). Worst Case: For an unsorted array, it
// will still have a time complexity of O(n^2), but the optimization reduces the number of
// unnecessary passes.

