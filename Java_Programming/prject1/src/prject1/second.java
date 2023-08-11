package prject1;
//import java.io.IOException;  


import java.util.Scanner;

public class second  {
	 
		 
		  public static void main(String args[])
		  {  
		   Scanner scan = new Scanner(System.in);
		   System.out.print("Enter Any Values= ");
		   try {
		   String a =scan.nextLine();
			System.out.println(a);   

		   }catch(Exception e)
		   {
			System.out.println("error");   
		   }
		   System.out.println("program over!");
		   scan.close();
		  }  
	
}
