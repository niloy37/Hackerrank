//https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos=0;
        int neg=0;
        int zero=0;
        int total=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
            pos++;
            else if(arr[i]<0)
            neg++;
            else zero++;
        }
        double ratio1=(pos*1.0)/total;
        double ratio2=(neg*1.0)/total;
        double ratio3=(zero*1.0)/total;
        System.out.println(ratio1);
        System.out.println(ratio2);
        System.out.println(ratio3);
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
//main
