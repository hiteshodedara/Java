package prject1;

public class nullPointer {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String name=null;
		arithmeticexc ari = new arithmeticexc();
		  ari.division(10, 2);

		try 
		{
			if(name.equals("hitesh"))
				System.out.println("both values are same.");
			else 
				System.out.println("both values are not same.");   
		}
		catch(NullPointerException e) {
			System.out.println("your Name values are null.");   

		}
	}

}
