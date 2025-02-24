package Recursion;

public class SumOnetoTen {


    static void sumOnetoTen(int n){
        int sum=0;

        if(n<10){
            sum=sum+n;
            sumOnetoTen(n-1);
        }

    }


    public static void main(String[] args) {

        sumOnetoTen(10);
    }
}
