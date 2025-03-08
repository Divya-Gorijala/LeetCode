package recursion;

public class FactorialRecursion {
    static int result=1;
    public static int factorial(int n){
        if(n>=2) {
            result = result * n;
            factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
