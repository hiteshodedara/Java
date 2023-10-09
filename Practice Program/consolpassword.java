import java.io.Console;
public class consolpassword{
	
public static void login() {
		Console cons;
		String username;
		String id=null;
		char[] password = null;
		if ((cons = System.console()) != null) {
			try {
				id = cons.readLine("Input your ID:");
				username = cons.readLine("Input your Username:");
				password = cons.readPassword("Input your Password:");
				System.out.println("Your ID was: " + id);
				System.out.println("Your username was: " + username);
				System.out.println("Your password was: " + new String(password));
			} finally {
				if (password != null) {
					java.util.Arrays.fill(password, ' ');
					}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}
	public static void main(String[] args) {
		
		login();
	}

} 
	
	

	

