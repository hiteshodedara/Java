import java.util.Scanner;

public class reversstring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter A String : ");
        char[] input=scan.nextLine().toCharArray();

        System.out.print("Revers String : ");
        for(int i=input.length-1;i>=0;i--){
            System.out.print(input[i]);
        }
        System.out.println();
        
        scan.close();
    }
}
