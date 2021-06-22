package FibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
	int num = 0;

	void UserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the series:");
		num = scan.nextInt();
		scan.close();
	}

	void PrintSeries() {
		int a = 0, b = 1, sum = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < num - 1; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum + " ");
		}
	}

	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		obj.UserInput();
		obj.PrintSeries();
	}
}
