package Paracticeprogs;

import java.util.Scanner;

public class decimalnumtohexanum {
	public static void main(String []a) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Decimal Number = ");
		int num=scan.nextInt();
		
		 System.out.println("Hexadecimal Number is = "+Integer.toHexString(num));
		
		scan.close();
	}
}
