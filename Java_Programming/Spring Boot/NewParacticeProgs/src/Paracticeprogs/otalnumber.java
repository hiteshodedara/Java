package Paracticeprogs;

import java.util.Scanner;

public class otalnumber {
	public static void main(String[]a) {
		
		            int dec_num, quot, i=1, j;
		        int oct_num[] = new int[10];
		        Scanner scan = new Scanner(System.in);
				
		        System.out.print("Input a Decimal Number: ");
		        dec_num = scan.nextInt();
		        scan.close();
		        quot = dec_num;
				
		        while(quot != 0)
		        {
		            oct_num[i++] = quot%9;
		            quot = quot/9;
		        }
				
		        System.out.print("Octal number is: ");
		        for(j=i-1; j>0; j--)
		        {
		            System.out.println(oct_num[j]);
		        }
//		        System.out.print(oct_num[1]);
				System.out.print("\n");
				
		    }
		
	}
