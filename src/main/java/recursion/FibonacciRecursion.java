package recursion;

public class FibonacciRecursion {
    static int result=1;

    public static int fibonacci(int n){
        if(n>=2){
            result=fibonacci(n-1)+fibonacci(n-2);
        }
        if(n==0) return 0;
        if(n==1) return 1;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
//result= fib(6)+fib (5)
//    fib(6)=fib(5)+fib(4)  fib(5)=fib(4)+fib(3)
//            fib(4)+fib(3)  3+2      3+2
//                3+2    2+1   2+1 1
//1 1 2 3 5 8 13