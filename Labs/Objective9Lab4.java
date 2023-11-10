import java.util.Scanner;

public class Objective9Lab4 {
	public static void main(String[] args){
		Scanner kb = new Scanner (System.in);
			double num1, num2;
		System.out.println("Please give me a number: ");
			num1 = kb.nextDouble();
			System.out.println("Please give me another number: ");
			num2 = kb.nextDouble();

		double average = findAverage();
		System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);

		kb.close();

	}

	public static void findAverage() {
		double num1, num2;
		double average = (num1 * num2 % 2);
		System.out.println(average);




	}
}