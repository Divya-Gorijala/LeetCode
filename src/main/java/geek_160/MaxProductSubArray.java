package geek_160;
// You need to find the maximum sum of a subarray.
public class MaxProductSubArray {
    public static void main(String[] args) {
        //int[] nums = {2,3,-4};//
        //int[] nums={3,-1,4};
        //int[] nums = {3,1,4,-4};
        //int[] nums={-3,-2,-1};
        //int[] nums = {2, -5, -2, -4, 3};
        //int[] nums={-2,0,-1};
        //int[] nums={2,0,-1};
        int[] nums= {1,0,-1,2,3,-5,-2};
        //int[] nums = {-1, 0, -2, 2};
        if (nums.length == 0) {
            return;
        }
        int maxProduct = nums[0];
        int currentProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxProduct = Math.max(maxProduct, 0);
                //System.out.println(maxProduct);
                currentProduct = 1;
                continue;
            }
            currentProduct = currentProduct * nums[i];
            System.out.println("i->"+i+" maxProduct->"+maxProduct+" currentProduct->"+currentProduct);
        }
        System.out.println(maxProduct);
    }
}

//int[] nums = {-1, 0, -2, 2};
//cur -1 max -1
//cur 0 max 0
//cur -2 max 0 max(max,current*nums[i],nums[i])
//cur -4 max 2
