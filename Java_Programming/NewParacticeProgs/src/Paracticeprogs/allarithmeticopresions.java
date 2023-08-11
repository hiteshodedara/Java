package Paracticeprogs;

import java.util.Scanner;

public class allarithmeticopresions {
	public static void main(String[]a) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter First Values= ");
		int val1=scan.nextInt();
		System.out.print("Enter Second Values= ");
		int val2=scan.nextInt();
		
		int addition=val1+val2;
		int substration =val1-val2;
		int multiplication=val1*val2;
		int division=val1/val2;
		int moduls=val1%val2;
		
		
		System.out.println("All Arithmetic Opretions");
		System.out.println("Addition of Two Values= "+addition);
		System.out.println("Substration of Two Values= "+substration);
		System.out.println("Multiplicatio of Two Values= "+multiplication);
		System.out.println("Division of two Values= "+division);
		System.out.println("Moduls of Two Values= "+moduls);
		
		scan.close();
		
	}
}
