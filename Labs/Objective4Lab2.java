import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);


		System.out.println("Please enter the first whole number you would like to add.");
		int num1 = Scanner.nextInt();
		System.out.println("Please enter the second whole number you would like to add.");
		int num2 = Scanner.nextInt();
		System.out.println("Please enter the third whole number you would like to add.");
		int num3 = Scanner.nextInt();

		System.out.println("Please enter the first decimal number you would like to add.");
		double dub1 = Scanner.nextDub();
		System.out.println("Please enter the second decimal number you would like to add.");
		double dub2 = Scanner.nextdDub();
		System.out.println("Please enter the third decimal number you would like to add.");
		double dub3 = Scanner.nextDub();

		int sum = num1 + num2 + num3;
		double dsum = dub1 + dub2 + dub3;

		System.out.println("The sum of" + num1 + "+" + num2 + "+" + num3 + "is" + sum + ".");
		System.out.println("The sum of" + dub1 + "+" + dub2 + "+" + dub3 + "is" + dsum + ".");


	}
}