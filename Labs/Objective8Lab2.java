public class Objective8Lab2 {
	public static void main(String[] args) {
		int count = 0;
		int sum = count + 1;

		for (count = 0; count <= 210; count += sum) {
			System.out.println(sum);
		
		count = count + 1;

		sum = count + sum;

		}
	}
}