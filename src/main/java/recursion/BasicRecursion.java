package recursion;

public class BasicRecursion {
    public static void printNumbers(int n){
       if(n>=1){
            System.out.println(n);  //5      4       3        2       1
            printNumbers(n-1);  //pri(4)  pri(3)  pri(2)   pri(1)  pri(0)
       }
        else {
            return;                //-
        }
        }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
