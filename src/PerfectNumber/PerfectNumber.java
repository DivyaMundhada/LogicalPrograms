package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
	int num, sum;

	void UserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the series:");
		num = scan.nextInt();
		scan.close();
	}

	void CheckNumber() {
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum = sum + i;
		}

		if (sum == num)
			System.out.println("It is a Perfect Number.");
		else
			System.out.println("It is not a perfect number.");

	}

	public static void main(String[] args) {
		PerfectNumber obj = new PerfectNumber();
		obj.UserInput();
		obj.CheckNumber();
	}

}
