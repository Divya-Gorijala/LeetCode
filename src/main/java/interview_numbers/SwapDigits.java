package interview_numbers;

public class SwapDigits {

    public static void main(String[] args) {
        long number = 123456;///10000; // --> 345600
        long num=number;
        //get number of digits in number
        int digitCount = 0;
        while(num>0){
            num=num/10;
            digitCount++;
        }
        int divisor = (int)Math.pow(10,digitCount-2);
        int numerator = (int)number/divisor;
        long remainder=number%divisor;
        long newNumber = remainder*100+numerator;
        System.out.println(newNumber);
    }
}
