package prject1;

import java.io.File;
import java.io.IOException;

public class jaavathrows {
	public static void throwerror(String filename)	throws NullPointerException,IOException 
	{
		if (filename==null) {
			throw new NullPointerException("file can not be null");
		}
		File file=new File(filename);
		if(!file.exists()) {
			throw new IOException("file is nor exists..");
		}
	}
	
	public static void main(String[] args) throws NullPointerException, IOException {
		String filename=null;
		throwerror(filename);
	}
}
