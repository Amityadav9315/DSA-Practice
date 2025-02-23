package stack.practice;

import stack.Stack;

import java.util.Scanner;

//import static jdk.vm.ci.code.Location.stack;

public class postfixoperation {

    public static int evalkuateExpression(String expression) {
        Stack stack = new Stack(expression.length());

        //get character
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            //if it is digit
            if (Character.isDigit(ch)) {
                //ch=0
                stack.push(ch - '0');


            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;

                    default:
                        System.out.println("Invalid operation");

                }


            }
        }
        return stack.pop();
    }




    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter postfix  Expression: ");
        String ex=sc.next();
        int result=evalkuateExpression(ex);
        System.out.println(result);


    }
}
