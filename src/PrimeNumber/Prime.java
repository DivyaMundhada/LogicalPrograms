package PrimeNumber;

import java.util.Scanner;

public class Prime {

	static int num;

	void UserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		scan.close();
	}

	public static boolean CheckPrime(int num) {
		boolean flag = false;
		if (num == 0 || num == 1) {
			System.out.println(num + " is neither Prime nor Composite.");
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				flag = false;
			else
				flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.UserInput();
		Prime.CheckPrime(num);

		boolean result = CheckPrime(num);
		if (result == false)
			System.out.println(num + " is not a prime number.");
		else
			System.out.println(num + " is a prime number.");
	}

}
