package Recursion;

import java.util.Scanner;

public class SumofArray {

    static int sumofArray(int[] arr, int n) {


        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumofArray(arr, n - 1);

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }



        int result=sumofArray(arr,n);
        System.out.println(result);


    }
}

