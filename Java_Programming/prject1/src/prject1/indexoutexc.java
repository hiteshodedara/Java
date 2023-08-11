
package prject1;

public class indexoutexc {
	public static void main(String[]a) {
		int a1[]=new int[5];
		try 
		{
		for(int i=0;i<6;i++) 
		{
			a1[i]=i;
			System.out.println(a1[i]);
		}
		}
		catch(Exception e) 
		{
			System.out.println("your array is to sort..");
		}
		}
	}


