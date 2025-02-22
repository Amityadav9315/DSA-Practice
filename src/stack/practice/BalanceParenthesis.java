package stack.practice;

import stack.Stack;

import javax.xml.stream.events.StartDocument;

public class BalanceParenthesis {



    public static boolean isExpressionBalanced(String expression){

        Stack stack=new Stack(expression.length());


        return false;

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

    }
}
