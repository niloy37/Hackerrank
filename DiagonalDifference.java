//https://www.hackerrank.com/challenges/diagonal-difference/problem
import java.util.*;
public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		int x=var.nextInt();
		int [][] arr = new int[x][x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				arr[i][j]=var.nextInt();
			}
		}
		int sum=0;
			for(int i=0;i<x;i++) {
				for(int j=0;j<x;j++) {
					if(i==j) {
						sum+=arr[i][j];
					}
				}
					
			}
			int sum1=0;
			int k=0;int l=x-1;
			for(int i=0;i<x;i++) {
				
					
						sum1+=arr[k][l];
						k++;
						l--;
						
					
				}
			
			int diagonalDifference = sum-sum1;
			
		int New=java.lang.Math.abs(diagonalDifference);
		System.out.println(New);
		
			
			
		}
	}


