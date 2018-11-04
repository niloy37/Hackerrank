//https://www.hackerrank.com/challenges/s10-weighted-mean/problem
import java.util.Scanner;
public class WeightedMean {
public static void main (String[] args) {
	Scanner var = new Scanner(System.in);
	int x = var.nextInt();
	
	int [] array1 = new int [x];
	int [] array2 = new int [x];
	
	
	for(int i=0;i<x;i++) {
		array1[i]=var.nextInt();
	}
	for(int i=0;i<x;i++) {
		array2[i]=var.nextInt();
	}
	int [] array = new int [x];
	int sum=0;
	int sum2=0;
	for(int i=0;i<x;i++) {
		array[i]= array1[i]*array2[i];
		sum=sum+array[i];
		sum2+=array2[i];
	}
	
	
	double weightedMean = (sum*1.0)/sum2;
	double z=(double)Math.round(weightedMean * 10d) / 10d;
	
	System.out.println(z);
	
	
	
}
}
