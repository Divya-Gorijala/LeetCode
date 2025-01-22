public class twoSum {

    public static void main(String[] args){
        int[] a={1,2,3};
        for(int i: twoSum(a,5)){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target){
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                }
            }
        }
        return ret;
    }
}
