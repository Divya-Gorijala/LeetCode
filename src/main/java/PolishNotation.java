import java.util.Stack;

public class PolishNotation {

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        PolishNotation pn=new PolishNotation();
        System.out.println(pn.evalRPN(tokens));
    }

    public int evalRPN(String[] tokens) {
        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();

        for (String t : tokens) {
            if (!operators.contains(t)) { //push to stack if it is a number
                stack.push(t);
            }
            else{
               int a= Integer.valueOf(stack.pop());
               int b= Integer.valueOf(stack.pop());
               switch (t){
                   case "+":
                       stack.push(String.valueOf(a+b));
                       break;
                   case "-":
                       stack.push(String.valueOf(a-b));
                       break;
                   case "*":
                       stack.push(String.valueOf(a*b));
                       break;
                   case "/":
                       stack.push(String.valueOf(a/b));
                       break;
               }
            }
        }

        int returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
