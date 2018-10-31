import java.util.Scanner;
public class SolveMeFirst {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);

	int a = var.nextInt();
	
	int b = var.nextInt();
	System.out.println(solveMeFirst(a,b));
	
}
public static int solveMeFirst(int a,int b) {
	return a+b;
}
}
