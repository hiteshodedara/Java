package Paracticeprogs;

import java.util.Scanner;

public class decimaltootalnumber {
	public static void main(String[]a) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter Decimal Number = ");
		int octal=scan.nextInt();
		
		System.out.print("Oxtal Number is = "+Integer.toOctalString(octal));
		
		
		scan.close();
	}
}
