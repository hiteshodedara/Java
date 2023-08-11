package prject1;

import java.util.ArrayList;
import java.util.Arrays;

public class Project1 {
	public static void show(ArrayList<String> parameterList) {

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
					parameterList.set(i, (params+="*"));
				}

//				System.out.println(params);

			}
			System.out.println(parameterList.get(i));
		}

	}

	public static void main(String[] args)

	{
		ArrayList<String> user = new ArrayList<String>(Arrays.asList("vipulodii","Sager", "Ram", "hitesh", "vipul"));
		show(user);
	}

}
