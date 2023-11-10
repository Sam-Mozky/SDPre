import java.util.Scanner;

public class Objective9Lab5 {
	public class void main(String[] args) {
		Scanner kb = new Scanner (System.in);
			double num1, num2;
			boolean keepGoing = true;
			int choice;
			double answer = 0.0;

		System.out.println("Please give me a number: ");
			num1 = kb.nextInt();
		System.out.println("Please give me another number: ");
			num2 = kb.nextInt();

			while (keepGoing) {
				printMenu();
				System.out.println("Which would you like to do? ");
				choice = kb.nextInt();

				switch (choice) {
				case 1:
					findSum();
				case 2:
					findAverage();
				case 3:
					calcTax();
				case 4:
					System.out.println("You've chosen to quit");
				default:
					System.out.println("That is not a valid number, try again");
				}
				kb.close();
			}

			public static void printMenu() {
				System.out.println();
				System.out.println("========= MENU =========");
				System.out.println("|                      |");
				System.out.println("|   1. Add Numbers     |");
				System.out.println("|   2. Find Average    |");
				System.out.println("|   3. Calculate Tax   |");
				System.out.println("|   4. Exit            |");
				System.out.println("|                      |");
				System.out.println("========================");
				System.out.println();

				}

			public static double findSum(double x, double y) {
				double sum = x + y;
				return sum;

				}

			public static double findAverage(double x, double y) {
				double = average (x + y) % 2;
				return average;

			}

			public static double calcTax(double x, double y){
				double tax = sum % 8.31;
				return tax;
			}


			
			
	}
}