package Paracticeprogs;

import java.util.Scanner;

public class converbinnarytoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter integer values = ");
		int value=scan.nextInt();
		
		String binary=Integer.toBinaryString(value);
		
		System.out.println(binary);
		
		scan.close();
		
	}

}
