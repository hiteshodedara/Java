import java.util.Scanner;

public class counteverything {
    public static void count(char[] a){
        int letters=0;
        int number=0;
        int speci=0;
        int space=0;

        for(int i=0;i<a.length;i++){
            if(Character.isDigit(a[i])){
                number++;
            }
        else if(Character.isLetter(a[i])){
            letters++;
        }
        else if(Character.isSpaceChar(a[i])){
            space++;
        }
        else{
            speci++;
        }
        }

        System.out.println("total Characteres are :"+letters);
        System.out.println("total Number are: "+number);
        System.out.println("total Other: "+speci);
        System.out.println("total Spaces are: "+space);
                
    }
    
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.print("Enter You String: ");
        char[] input=scan.nextLine().toCharArray();
        count(input);
        scan.close();
    }
}
