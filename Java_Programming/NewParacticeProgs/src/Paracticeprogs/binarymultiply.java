package Paracticeprogs;

public class binarymultiply {

	public static void main(String[] args) {
		String first ="10";
		String second ="11";
		
		int num1 = Integer.parseInt(first, 2);
        // converting binary string into integer(decimal
        // number)
 
        int num2 = Integer.parseInt(second, 2);
        // converting binary string into integer(decimal
        // number)
 
        int multi = num1 * num2;
        // Adding those two decimal numbers and storing in
        // sum
 
        String result = Integer.toBinaryString(multi);
        
        System.out.print("Sum of Binary value is= ");
        System.out.println(result);

	}

}
