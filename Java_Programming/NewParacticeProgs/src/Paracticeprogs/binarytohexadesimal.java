package Paracticeprogs;

import java.util.Scanner;

public class binarytohexadesimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		long binaryNumber, decimalNumber = 0, j = 1, remainder;
		  System.out.print("Input a binary number: ");
		  binaryNumber = scan.nextLong();

		  while (binaryNumber != 0) 
		  {
		   remainder = binaryNumber % 10;
		   decimalNumber = decimalNumber + remainder * j;
		   j = j * 2;
		   binaryNumber = binaryNumber / 10;
		  }
		  int num = (int) decimalNumber;
		  
		  System.out.println("Hexadecimal value is = "+Integer.toHexString(num));
		  
		scan.close();

	}

}
