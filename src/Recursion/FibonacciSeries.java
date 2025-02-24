package Recursion;

public class FibonacciSeries {

    static int fibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);


    }
    public static void main(String[] args) {


       // int result=fibonacciSeries(5);
       // System.out.println(result);

        for(int i=0; i<=9; i++){

            System.out.println(fibonacciSeries(i));
        }

    }
}
