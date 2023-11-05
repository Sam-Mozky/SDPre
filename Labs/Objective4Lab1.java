import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String firstname = " ";
		String lastname = " ";
		String favoriteAnimal = " ";
		String favoriteFood = " ";
		String favoriteSong = " ";


		System.out.println("What is your first name?");
		String userInput = keyboard.nextLine();

		System.out.println("What is your last name?");
		keyboard.nextLine();

		System.out.println("What is your favorite Animal?");
		keyboard.nextLine();

		System.out.println("What is your favorite food?");
		keyboard.nextLine();

		System.out.println("What is your favorite song?");
		keyboard.nextLine();

		System.out.println("My first name is " + userInput + ".");
		System.out.println("My last name is " + userInput + ".");
		System.out.println("My favorite animal is " + userInput + ".");
		System.out.println("My favorite Food is " + userInput + ".");
		System.out.println("My favorite song is " + userInput + ".");



	}
}