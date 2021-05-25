package functionalprogramming;

import ooppillars.Driveable;

public class Simulator {

	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldImplementation();
		hwi.printHello();

		HelloWorldInterface hlam = () -> {
			System.out.println("Hello World - Lambdas are cool!");
		};
		hlam.printHello();
		
		TakeInputInterface tii = (x, y) -> {
			System.out.println("Input one was: " + x + 
					"\nInput two was: " + y);
		};		
		tii.printInput(15, 35);
		
		performDrive ( () -> {
			System.out.println("Kinda cool");
			}
		);
		
		Driveable drive = () -> {System.out.println("Passed with a reference");};
		performDrive(drive);
	}
	
	public static void performDrive(Driveable d) {
		d.drive();
	}
}
