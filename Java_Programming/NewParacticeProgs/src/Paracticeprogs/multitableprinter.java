package Paracticeprogs;

import java.util.Scanner;

public class multitableprinter {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Which Multiplition Table you Want to Print= ");
		int count=scan.nextInt();
		
		System.out.println("-- Table --");
		for(int i =0;i<10;i++) {
			System.out.println(count+"X"+(i+1)+"="+count*(i+1));
			
		}
		
		scan.close();
	}

}
