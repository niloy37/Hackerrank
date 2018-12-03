//https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int binary = 0;
        int max = 0;
        int count = 0;
        while (n > 0) {
            binary = binary * 10 + n % 2;
            if (n % 2 == 1) {
                count++;
                if (count > max)
                    max = count;
            } else
                count = 0;
            n = n / 2;

        }
        //reversing and making it orginal
        /*int rev = 0;
        while (binary > 0) {
            rev = rev * 10 + binary % 10;
            binary = binary / 10;
        } */
        //blocked cause submitted this to hackerank
        //System.out.println(rev);
        System.out.println(max);

        scanner.close();
    }
}
