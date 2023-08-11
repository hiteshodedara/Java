package prject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class logintype {
	public static void show(ArrayList<String> parameterList, ArrayList<String> parameterList2) {

		ArrayList<Integer> counter = new ArrayList<Integer>();

		int unumber = 0;
		for (int i = 0; i < parameterList.size(); i++) {
			String anscount = parameterList.get(i);
			int itemcount = anscount.length();
			counter.add(itemcount);
			// System.out.println(counter.get(i));

		}
		for (int i = 0; i < counter.size(); i++) {

			// For Sort list
			counter.sort(null);

			// now is sorted
			int sizeof = counter.size();

			String unames = parameterList.get(i);
//			 System.out.println(parameterList.get(i));

			int namesize = unames.length();
//			 System.out.println(namesize);

			unumber = counter.get(sizeof - 1);
//			 System.out.println(unumber);

			// for check every element have same size
			if (unumber != namesize) {
				String params = parameterList.get(i);
				int spacesize = unumber - namesize;
//				System.out.println(spacesize);
				for (int j = 0; j < spacesize; j++) {
					parameterList.set(i, (params += " "));
				}

//				System.out.println(params);

			}
			System.out.println((i + 1) + "   " + parameterList.get(i) + "    " + parameterList2.get(i));
		}

	}

	public static void main(String[] args) {
		ArrayList<String> userName = new ArrayList<String>(Arrays.asList("vipulodii", "Hitesh", "Sagar", "Rohit"));
		ArrayList<String> userPassword = new ArrayList<String>(
				Arrays.asList("vipulodii12", "hitesh123", "raj123", "rohit123"));

		int ans = 0;
		while (ans<1) {
			System.out.println("\t-- User Details --");
			System.out.println("-- Menu --");
			System.out.println("1.All Users");
			System.out.println("2.Add User");
			System.out.println("3.Remove User");
			System.out.println("4.Exit");

			System.out.print("\nEnter Number= ");
			Scanner scan = new Scanner(System.in);
			try {
				ans = scan.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}

			if (ans == 1) {
				System.out.println("All Users Names and Password\n");
				System.out.println("id  UserName     UserPassword");
				show(userName, userPassword);
				ans=0;

			}

			else if (ans == 2) {
				System.out.println("-- Add New User --");
				System.out.print("Enter User Name= ");
				String newuser = scan.next();
				userName.add(newuser);

				System.out.print("Enter user Password= ");
				String newpassword = scan.next();
				userPassword.add(newpassword);

				System.out.println("All Users Names and Password\n");
				System.out.println("id  UserName     UserPassword");
				show(userName, userPassword);
			} else if (ans == 3) {
				System.out.println("Remove Users");
				System.out.println("All Users Names and Password\n");
				System.out.println("  UserName     UserPassword");
				show(userName, userPassword);

				System.out.println("Enter Id Number= ");
				int detitem = scan.nextInt();

				userName.remove(1 - detitem);
				userPassword.remove(1 - detitem);

				System.out.println("All Users Names and Password\n");
				System.out.println("  UserName     UserPassword");
				show(userName, userPassword);

			} else if (ans == 4) {
				ans=1;

			} else {
				System.out.println("You Enter Wrong Number.. Please enter again..");

			}

			System.out.println("\nProgram is over..");

			scan.close();
		}
	}
}
