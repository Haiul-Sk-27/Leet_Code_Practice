import java.util.Stack;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));  
    }
    
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/";
        
        for (String t : tokens) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int b = Integer.valueOf(stack.pop());  
                int a = Integer.valueOf(stack.pop()); 
                if(t.equals("+")) {
                    stack.push(String.valueOf(a + b));
                } else if(t.equals("-")) {
                    stack.push(String.valueOf(a - b));
                } else if(t.equals("*")) {
                    stack.push(String.valueOf(a * b));
                } else if(t.equals("/")) {
                    stack.push(String.valueOf(a / b));
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
