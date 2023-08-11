package prject1;

import java.util.Scanner;

public class numfomexc {

	public static void main(String[] args) {
		int number;
		Scanner scan =new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter Number: ");   

			number=Integer.parseInt(scan.next());
			System.out.println(number);   

		}
		catch(NumberFormatException e) {
			System.out.println("error: You can only enter integer values.");   
		}
		scan.close();
	}
}
