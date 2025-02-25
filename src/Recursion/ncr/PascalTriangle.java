package Recursion.ncr;

public class PascalTriangle {

    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }

        return n*fact(n-1);

    }

    static int PascalTriangle(int n,int r){

        if(r>0){
            return 0;
        }
        int factN=fact(n);
        int factR=fact(r);
        int factNR=fact(n-r);

        return factN/(factR*(factNR));

    }

    public static void main(String[] args) {

    }
}
