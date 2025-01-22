package algorithms.search_algorithms;

public class BinarySearchAlogithm {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=5;
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(right+left)/2;
            //check if key is at mid
            if(arr[mid]==key){
                System.out.println("index "+mid);
                return;
            }
            if(arr[mid]>key){
                right=mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println("Element not found");
    }
}
