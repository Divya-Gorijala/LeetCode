import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args){
        int nums[]={1,3,6,7,8};
        System.out.println(findKthLargest(nums,3));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
