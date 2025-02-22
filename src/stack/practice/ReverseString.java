package stack.practice;

import stack.Stack;

public class ReverseString {


    public static String reverseString(String str) {

        Stack stack = new Stack(str.length());

        //fetch the character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //important thing
            stack.push(ch);
        }

          //stack.displayElements();

        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            int pop= stack.pop();
            result.append((char) pop);


        }
        return result.toString();


}

    public static void main(String[] args) {
          String rs=reverseString("hello");
        System.out.println(rs);
        System.out.println(reverseString("Amit"));
    }

}
