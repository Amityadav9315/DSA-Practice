package Recursion;

public class OneToTen {
    static void onetoten(int n){
        System.out.println(n);
        if(n<10){
            onetoten(n+1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Program started");
        onetoten(1);

    }
}
