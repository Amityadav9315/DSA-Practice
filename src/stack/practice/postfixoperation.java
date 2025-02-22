package stack.practice;

import java.util.Stack;

public class postfixoperation {


    public static int evaluatePostfix(String expression) {

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, push it onto the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert character to integer
            }
            // If the character is an operator
            else {
                // Pop the two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation based on the operator
                int result = 0;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("Invalid operator: " + ch);
                        return -1;
                }

                // Push the result back onto the stack
                stack.push(result);
            }
        }

        // The result is the only item left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "23*5+";  // Example postfix expression
        System.out.println("Postfix Expression: " + expression);
        System.out.println("Evaluation Result: " + evaluatePostfix(expression));
    }
}
