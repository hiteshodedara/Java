package Paracticeprogs;

import java.util.Scanner;

public class takeinputandsum {
	public static void main(String[]a) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter First values= ");
		int val1=scan.nextInt();
		System.out.print("Enter Second values= ");
		int val2=scan.nextInt();
		
		int sumans=val1+val2;
		
		System.out.print("Sum of Two Values is= "+sumans);
		
		scan.close();
	}
}
