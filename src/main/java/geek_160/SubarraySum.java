package geek_160;

public class SubarraySum {
    public static void main(String[] args) {
        //int[] arr={1,2,3,7,5};
        // int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr={5, 3, 4};
        int[] arr={7 ,31 ,14 ,19 ,1 ,42, 13, 6 ,11 ,10 ,25 ,38, 49, 34 ,46, 42, 3, 1};
        int target =42;
        boolean noArray=true;
        int sum=0;
        int startIndex=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.println("sum1 - "+sum+" startIndex -"+startIndex+" || endIndex -"+ i);
//            if(sum>target){
//                sum=sum-arr[startIndex];
//                startIndex=startIndex+1;
//            }

            while(sum>target){
                sum=sum-arr[startIndex];
                startIndex=startIndex+1;
            }
            System.out.println("sum2 - "+sum+" startIndex -"+startIndex+" || endIndex -"+ i);
            if(sum==target){
                noArray=false;
                startIndex++;
                i++;
                System.out.println("SubArray - ["+ startIndex+", "+i+"]");
                break;
            }
        }
        if(noArray==true){
            System.out.println(-1);
        }
    }
}
