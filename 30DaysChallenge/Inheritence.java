//https://www.hackerrank.com/challenges/30-inheritance/problem

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
 Student(String firstName, String lastName, int identification,int [] testScores){
     super(firstName,lastName,identification);
     this.testScores=testScores;
 }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        double sum=0;
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];

        }
        double average = sum/testScores.length;

        if(average<=100 && average>=90){
return 'O';
        }
        else if(average<90 && average>=80){
return 'E';
        }
        else if(average<80 && average>=70){
return 'A';
        }
        else if (average<70 && average>=55){
return 'P';
        }
        else if(average<55 && average>=40){
return 'D';
        }
        else return 'T';

    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
