package Paracticeprogs;

public class binnarysum {
	public static void main(String[]a) {
		
		String first ="10";
		String second ="11";
		
		int num1 = Integer.parseInt(first, 2);
        // converting binary string into integer(decimal
        // number)
 
        int num2 = Integer.parseInt(second, 2);
        // converting binary string into integer(decimal
        // number)
 
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum
 
        String result = Integer.toBinaryString(sum);
        
        System.out.println("Sum of Binary value is= ");
        System.out.println(result);
	}
}
