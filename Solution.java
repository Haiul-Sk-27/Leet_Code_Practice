import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens1));  
        System.out.println(evalRPN(tokens2));  
    }
    
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/";
        
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            } else {
                int b = Integer.valueOf(stack.pop());  
                int a = Integer.valueOf(stack.pop()); 
                int index = operators.indexOf(t);
                switch(index){
                    case 0: stack.push(String.valueOf(a + b)); break; 
                    case 1: stack.push(String.valueOf(a - b)); break; 
                    case 2: stack.push(String.valueOf(a * b)); break; 
                    case 3: stack.push(String.valueOf(a / b)); break; 
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
