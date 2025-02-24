package Recursion;

public class OneToTen {


    static void Onetoten(int n){
        System.out.println(n);
         if(n>0) {
             Onetoten(n - 1);
         }anch

    }

    public static void main(String[] args) {
        System.out.println("Programe started");
        Onetoten(10);




    }
}
