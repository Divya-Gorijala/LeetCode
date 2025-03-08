package geek_160;

public class ArraySquares {
    //nums = [-4,-1,0,3,10]
    //[16,1,0,9,100].
    //[0,1,9,16,100]
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int n=nums.length;
        int indexMax=n-1;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        while(indexMax>0){
            if(nums[0]>nums[indexMax]) {
                insetElements(nums,indexMax,0);
            }
            indexMax--;
        }
        for(int ele: nums){
            System.out.print(ele+" ");
        }
    }

    static void insetElements(int[] nums,int indexMax,int start){
        int temp=nums[start];
        //System
        for(int i=start;i<indexMax;i++){
            nums[i]=nums[i+1];
        }
        nums[indexMax]=temp;
    }
}
