package geek_160;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=-1;
        int second_max=-1;
        for(int num: arr){
            if(num>max){
                second_max=max;
                max=num;
            }
            else if(second_max<num&&num<max){
                second_max=num;
            }
        }
        return second_max;
    }
}