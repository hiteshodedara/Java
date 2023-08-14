package Paracticeprogs;

import java.util.Scanner;

public class hexadetodecimalvalues {

	public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdec_num;
        int dec_num;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();
		
        dec_num = hex_to_decimal(hexdec_num);
		
        System.out.print("Equivalent decimal number is: " + dec_num+"\n");
        scan.close();
	}

}
