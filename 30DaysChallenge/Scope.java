//https://www.hackerrank.com/challenges/30-scope/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int [] elements ){
        this.elements= elements;

    }
    public void  computeDifference() {
        maximumDifference=0;
        int difference;
        for(int i=0;i<elements.length-1;i++){
            for(int j=0;j<elements.length;j++){
            if(elements[i]>=elements[j]){
            difference = Math.abs(elements[i]-elements[j]);
            }
             
             else 
                difference = Math.abs(elements[j] - elements[i]);
           //Math.abs(difference);
            if(difference>=maximumDifference){
                maximumDifference=difference;
            }
         }
        }
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
