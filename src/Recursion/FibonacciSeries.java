package Recursion;

public class FibonacciSeries {

    static int fibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacciSeries(n-1+n-2);


    }
    public static void main(String[] args) {


        int result=fibonacciSeries(4);
        System.out.println(result);

    }
}
