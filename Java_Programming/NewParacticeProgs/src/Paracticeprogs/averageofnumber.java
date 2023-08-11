package Paracticeprogs;

import java.util.Scanner;

public class averageofnumber {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan =new Scanner(System.in);
		
		System.out.print("How Many Subject Are There= ");
		int subcount=scan.nextInt();
		
		for(int i=0;i<subcount;i++) {
			System.out.print("Enter Subject "+(i+1)+" Marks= ");
			int rname=scan.nextInt();
			count+=rname;
			
		}
		System.out.println("Total = "+count);
		
		float aver=count/subcount;

		System.out.println("Average = "+aver);
		
		scan.close();
	}

}
