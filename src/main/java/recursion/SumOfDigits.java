package recursion;

public class SumOfDigits {
    static int sum=0;
    public static int sumDigits(int n) {
        if(n>=1) {
            sum = sum + n % 10;
            System.out.println(sum);
            sumDigits(n / 10);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(1234)); // Output: 10 (1+2+3+4)
    }
}