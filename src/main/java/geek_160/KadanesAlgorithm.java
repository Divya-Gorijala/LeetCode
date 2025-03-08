package geek_160;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        // int[] arr={2, -3, 1, 7, -1, 2, 3};
        //int[] arr={-2, -4};
        // int[] arr={5, 4, 1, 7, 8};
        int[] arr={2, -3, -8, 7, -1, 2, -3,10};
        int n=arr.length;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
                System.out.println(maxSum);
            }
            if(currentSum<0){
                currentSum=0;
            }
            System.out.println(currentSum+"cu");
        }
        System.out.println(maxSum);
    }
}
