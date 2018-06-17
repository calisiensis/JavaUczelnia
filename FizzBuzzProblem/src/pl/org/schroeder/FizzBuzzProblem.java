package pl.org.schroeder;

public class FizzBuzzProblem {

	public static void main(String[] args) {
		String pom;
		for (int i = 1; i <= 100; i++) {
			pom = Integer.toString(i);
			if (i % 3 == 0) {
				System.out.print("Fizz");
				pom = "";
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				pom = "";
			}
			System.out.println(pom);
		}

	}

}