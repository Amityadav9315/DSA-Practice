package Recursion;

public class Mainrecursion {

    static  void printNum(int n){
        if(n==1){
            System.out.println(1);
        }
        else {
            System.out.println(n);
            printNum(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Programe started");
        printNum(5);
    }
}
