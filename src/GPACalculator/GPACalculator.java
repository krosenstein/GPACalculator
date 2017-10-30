package GPACalculator;

import java.util.Scanner;

public class GPACalculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numClass = 0;
		int count = 0;
		String grade = "";
		double gpa = 0.0, sum = 0, finalGpa = 0;
		double credits = 0, totalCredits = 0;
		System.out.println("How many classes do you take? ");
		numClass = sc.nextInt();
		for(int i = 0; i < numClass; i++)
		{
			count = i + 1;
			System.out.println("What's your grade in class #" + count + "? (letter grade in caps) ");
			grade = sc.next();
			System.out.println("How many credits is class #" + count + "?");
			credits = sc.nextDouble();
			if (grade.equals("A") || grade.equals("A+"))
			{
				gpa = 4.0 * credits;
			}
			else if (grade.equals("A-"))
			{
				gpa = 3.7 * credits;
			}
			else if (grade.equals("B+"))
			{
				gpa = 3.3 * credits;
			}
			else if (grade.equals("B"))
			{
				gpa = 3.00 * credits;
			}
			else if (grade.equals("B-"))
			{
				gpa = 2.7 * credits;
			}
			else if (grade.equals("C+"))
			{
				gpa = 2.3 * credits;
			}
			else if (grade.equals("C"))
			{
				gpa = 2.00 * credits;
			}
			else if (grade.equals("C-"))
			{
				gpa = 1.7 * credits;
			}
			else if (grade.equals("D+"))
			{
				gpa = 1.3 * credits;
			}
			else if (grade.equals("D"))
			{
				gpa = 1.00 * credits;
			}
			else if (grade.equals("D-"))
			{
				gpa = 0.7 * credits;
			}
			else if (grade.equals("F"))
			{
				gpa = 0;
			}
			else
			{
				System.out.println("Invalid GPA, start over" );
			}
			sum += gpa;
			totalCredits += credits;
		}
		finalGpa = sum / totalCredits;
		System.out.println("Your GPA is a " + finalGpa);
	}
}