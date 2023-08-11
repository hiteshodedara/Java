package Paracticeprogs;

import java.util.Scanner;

public class swaptwovariable {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter First values= ");
		int val1=scan.nextInt();
		System.out.print("Enter Second values= ");
		int val2=scan.nextInt();
		
		
		System.out.println("Before Swaping..");
		System.out.println("First value are = "+val1+"\nSecond Value Are = "+val2);
		
		int val3=0;
		
		val3=val1;
		val1=val2;
		val2=val3;
		
		System.out.println("After Swaping..");
		System.out.println("First value are = "+val1+"\nSecond Value Are = "+val2);
		
		
		
		
		scan.close();

	}

}
