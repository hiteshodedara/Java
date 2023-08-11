package prject1;

public class arithmeticexc {
	public int division(int a,int b)
	{
		int ans=a/b;
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		arithmeticexc aexc=new arithmeticexc();
		try {
				aexc.division(10, 0);
			}
		catch(ArithmeticException e) 
			{
				System.out.println("Error:You Can Not Divide Any Value By 0.");
			}
	}

}
