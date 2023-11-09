public class Objective7Lab3 {
	public static void main (String[] args) {
		int counter = 1;

		do {
			System.out.println(counter + " is odd.");
			counter = counter + 1;
		} while (counter % 3 == 0);

		do {
			System.out.println(counter + " is even.");
			counter = counter +1;
		} while (counter % 2 == 0);

	}
}