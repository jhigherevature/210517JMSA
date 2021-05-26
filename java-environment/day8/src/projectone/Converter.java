package projectone;

import java.util.Scanner;

public class Converter {
	public static Scanner scan = new Scanner(System.in);
	
	/*
	 * This 'getInput' method could be used to gather any input
	 * for my scanner, whether that is for menu selecting or for calculations...
	 * since calculations will use decimal values, and my menu selections
	 * use whole numbers, I will default to returning a double...
	 */
	public static double getInput() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	public static void main(String[] args) {
		System.out.println("Give me input");
		System.out.println("You should probably abstract your menus...");
		
		int x = (int)5.99; // this stores 5
		
		IMenuPrint print = () -> {
			System.out.println("Option 1: Distance\n"
					+ "Option 2: Currency\n"
					+ "Option 5: Exit");
		};
		
		boolean isRunning = true;
		
		outer: while (isRunning) {
			printMenu();
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				doConversionOne();
				break;
			case 2:
				doConversionTwo();
				break;
			// More code below...
			case 5:
				isRunning = false;
				break outer;
			}
			
		}
	}
	
	public static void doConversionOne() {
		System.out.println("Give me units to convert [1]");
		double input = scan.nextDouble();
		System.out.println("Your conversion is: " + input*10);
	}
	
	public static void doConversionTwo() {
		System.out.println("Give me units to convert [2]");
		double input = scan.nextDouble();
		System.out.println("Your conversion is: " + input*10);
	}
	
	public static void printMenuUsingLambda(IMenuPrint p) {
		p.printMenu();
	}
	
	public static void printMenu() {
		System.out.println("Option 1: Distance\n"
				+ "Option 2: Currency\n"
				+ "Option 5: Exit");
	}

	public static double convertDistance() {
		System.out.println("Choose a distance conversion");
		int subMenu = scan.nextInt();
		double ret = 0;
		switch (subMenu) {
		case 1:
			System.out.println("Calculation...");
			double input = scan.nextDouble();
			ret = input * 10;
			break;
		}

		return ret;
	}
}
