package stack.practice;

import stack.Stack;

import javax.xml.stream.events.StartDocument;

public class BalanceParenthesis {



    public static boolean isExpressionBalanced(String expression){

        Stack stack=new Stack(expression.length());
        for(int i=0; i<expression.length(); i++){
            char ch=expression.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            } else if (ch=='}'||ch==')'||ch==']') {
                if(stack.isEmpty()){
                    return false;
                }
                char top= (char) stack.pop();
                if(!isMatchingPair(top,ch)){
                    return false;

                }


            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }



    }
      private static  boolean isMatchingPair(char open,char close){

        if(open=='('&& close==')'){
            return true;
        }
        else if(open=='{'&& close=='}'){
            return true;
        }
        else if(open=='['&&close==']'){
            return true;
        }
        else{
            return false;

        }


      }

    public static void main(String[] args) {

        System.out.println(isExpressionBalanced("({[]}))"));

    }
}
