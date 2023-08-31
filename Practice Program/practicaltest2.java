import java.util.Scanner;
public class practicaltest2{
 public static void main(String[] args) {

  int n;
//   char s1, s2, s3;
  Scanner in = new Scanner(System.in);
  System.out.print("Input number: ");
  try{
  n = in .nextInt();
  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
  }
  catch(Exception e){
  System.out.println(e);
  }
  finally{
      in.close();
  }
 }
}