package Recursion;

public class recirsion {


    static void printData1(int n){

        System.out.println(n);
    }
    static  void printData(int n){
        System.out.println(n);
        printData1(n-1);
    }

    public static void main(String[] args) {

        System.out.println("Programe started");

          printData(5);
        System.out.println("Programe end");

    }
}
