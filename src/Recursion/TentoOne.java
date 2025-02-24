package Recursion;

public class TentoOne {


    static void tentoone(int n){

        System.out.println(n);
        if(n>0){
            tentoone(n-1);

        }

    }
    public static void main(String[] args) {
        System.out.println("Program started");
        tentoone(10);

    }
}
