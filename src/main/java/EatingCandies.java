public class EatingCandies {
    public static void main(String[] args){
        int num = 0;
        int[] candies={2,5,3,4};
        for(int i=0;i<candies.length/2;i++){
            num=candies[i]+candies[candies.length-i-1];
        }
        System.out.println(num);
    }
}
