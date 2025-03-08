package geek_160;

public class NextPermutation {
    public static void main(String[] args) {
        int temp;
        boolean getLowest=true; //321
        // int[] arr={2, 4, 1, 7, 5, 0};{2,4,5,0,1,7} // 9 8 --7 6
        int arr[] = {3, 4, 2, 5, 1};//{ 3,4,5,1,2}
        //c.o-             62 92 96 43 28 37 92 5 3 83 22 54 93
        //my o/p           62 92 96 43 28 37 92 5 3 83 22 54 93
        int size = arr.length;
        for (int i = size - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                getLowest=false;
                //swap the numbers i and i-1
                System.out.println("arr[i]--"+arr[i]);
                System.out.println("arr[i-1]--"+arr[i-1]);
                //find a num greater than 53 from right
                int index= getSecondIndex(arr,i);
                //
//                if(index==i){
//                    //swap right most number to i-1
//                    System.out.println();
//                    temp=arr[i-1];
//                    arr[i-1]=arr[size-1];
//                    arr[size-1]=temp;
//                    break;
//                }
                //swap index & i-1
                temp=arr[i-1];
                arr[i-1]=arr[index];
                arr[index]=temp;
                //reverse the elements from i
                reverseArr(arr,i,size-1);
                break;
            }
        }
        if(getLowest==true){
            reverseArr(arr,0,size-1);
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static int getSecondIndex(int[] arr,int i) {
        for(int j=arr.length-1;j>=i;j--) {
            if (arr[j] > arr[i - 1]) {
                System.out.println(arr[j]);
                return j;
            }
        }
            return -1;
        }


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
    }

