package geek_160;

public class RotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    //static void rotateArr(int arr[], int d) {
    static void rotateArr(){
        int[] arr = {1, 2, 3, 4};
        int arrLength = arr.length;
        int d = 2;
        //System.out.println(arr.toString());
        // add your code here
        // 1 2 3 4
        //2 3 4 1 d-1
        //34 12 --> 21 43 --> 3412
        //4 123 --> 321 4 --> 4 123
            if (d > arrLength) {
                d = d % arrLength;
            }
            //reverse element
            reverseArr(arr,0,d-1);
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
            reverseArr(arr,d,arrLength-1);
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
            reverseArr(arr,0,arrLength-1);
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
            //System.out.println(arr.toString());
//            for(int ele: arr){
//                System.out.println(ele);
//            }
        }

        //reverse elements in arr

    static void reverseArr(int arr[],int start,int end){
        int temp;
        for(int i=start;i<start+(end+1-start)/2;i++){
            System.out.println("start-"+start+" end-"+end);
            temp=arr[i];
            System.out.println("i- "+i);
            arr[i]= arr[end-i+start];
            arr[end-i+start]=temp;
            System.out.println("end-i -- "+(end-i+start));
        }
    }

    public static void main(String[] args) {
        rotateArr();
    }
}