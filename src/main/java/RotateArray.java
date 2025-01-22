public class RotateArray {
    public static void main(String[] args){
        RotateArray r=new RotateArray();
        int nums[]={1,2,3,4,5,6};
         int k=2;
         r.printArray(nums);
        r.rotate(nums,k);
        r.printArray(nums);
    }

    public int[] rotate(int[] nums, int k){
        if(k>nums.length)
            k=k%nums.length;

        int[] result= new int[nums.length];

        for(int i=0; i<k; i++){
            result[i] = nums[nums.length-k+i];
            //System.out.println(result[i]);
        }

        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }


        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }
        return nums;
    }

    public void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
