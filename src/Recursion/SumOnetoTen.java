package Recursion;

public class SumOnetoTen {


    static int  sumOnetoTen(int n){


        if(n==1){
            return 1;
        }
        else{
            return n+sumOnetoTen(n-1);
        }
    //    System.out.println(sum);

    }


    public static void main(String[] args) {

        int result=sumOnetoTen(10);
        System.out.println(result);


    }
}
