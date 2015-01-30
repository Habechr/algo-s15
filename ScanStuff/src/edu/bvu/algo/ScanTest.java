package edu.bvu.algo;

import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter something: ");
		String line = in.nextLine();
		while (!line.equals("quit")) {
			System.out.println(line);
			System.out.print("Enter something: ");
			line = in.nextLine();
		}
	}

}
