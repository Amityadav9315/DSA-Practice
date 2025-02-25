package Recursion.ncr;

public class NCRITR {

    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    static  int nCrRecursion(int n,int r){

        if(r==0||r==n){
            return 1;

        }
        if(r>n){
            return 0;
        }

        return nCrRecursion(n-1,r-1)+nCrRecursion(n-1,r);

    }

    //combination
    //ncr
    static int ncr(int n,int r){

        if(r>n){
            return 0;
        }

        int factN=fact(n);
        int factR=fact(r);
        int factNR=fact(n-r);

        return factN/(factR*(factNR));
    }

    public static void main(String[] args) {

        int n=10;
        int r=10;
        System.out.println(nCrRecursion(n,r));



    }
}
