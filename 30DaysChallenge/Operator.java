import java.util.*;

class Operator {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		double mealCost = var.nextDouble();
		int tipPercent = var.nextInt();
		int taxPercent = var.nextInt();
		
		
		double tip = mealCost *((tipPercent*1.0/100));
		double tax = mealCost *((taxPercent*1.0/100));
		double totalCost = mealCost+tip+tax;
		
		
		System.out.println(Math.round(totalCost));
	}
	
	
}