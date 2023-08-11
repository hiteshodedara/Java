package prject1;

import java.util.Scanner;

public class allexce {

	public static void main(String[] args) {
		System.out.print("Enter Values: ");
		Scanner scan=new Scanner(System.in);

		if(scan.hasNextInt()) {
			System.out.println("is int");   
		}
		else if (scan.hasNextFloat()) 
		{
			System.out.println("is float");   
		}
		else if(scan.hasNextBoolean()) 
		{
			System.out.println("is Boolean");
		}
		else if (scan.hasNextLine()) {
			System.out.println("is String");
		}
		scan.close();
	}

}
