package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub

//		try {
//			System.out.println(4/2);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.err.println("Ga bisa di bagi dengan 0");
//		} finally {
//			System.out.println("Bakal ke run");
//		}

		Scanner scan = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("Menu:");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update:");
			System.out.println("4. Delete:");
			System.out.println("5. Exit:");
			System.out.print(">> ");

			try {
				choice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Input format wrong!");
				System.out.println("Press to continue...");
				scan.nextLine();
			}
			scan.nextLine();
		} while (choice != 5);
		
		checkAge(10);
	}
	
	public void checkAge(int a) {
		if (a < 18) {
			throw new ArithmeticException("Masih di bawah umur");
		}else {
			System.out.println("Pass");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
