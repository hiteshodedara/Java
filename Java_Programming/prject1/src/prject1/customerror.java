package prject1;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("serial")
class CustomException extends Exception {
public CustomException(String message) {
    super(message); 
  }
}
class customerror {
	
  ArrayList<String> languages = new ArrayList<>(Arrays.asList("banna", "mango", "apple"));

  public void checkLanguage(String language) throws CustomException {
    
    if(languages.contains(language)) {
      throw new CustomException(language + " already exists");
    }
    else {     
      languages.add(language);
      System.out.println(language + " is added to the ArrayList");
    }
  }

  public static void main(String[] args) {
    
	  customerror obj = new customerror();
    
    try {
    	obj.checkLanguage("barry");
    	obj.checkLanguage("barry");
        }

    catch(CustomException e) {
      System.out.println("[" + e + "] Exception Occured");
    }
  }
} 